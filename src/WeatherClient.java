import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class WeatherClient {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter city name: ");
        String city = sc.nextLine();

        // Use your API key from OpenWeatherMap
        String apiKey = "b0fd6d7105314a288b080bd446e55aff";
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q="
                + city + "&appid=" + apiKey + "&units=metric";

        try {

            URL url = java.net.URI.create(apiUrl).toURL();
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            int status = con.getResponseCode();

            if (status == 200) {
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(con.getInputStream()));

                String inputLine;
                StringBuilder content = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }

                in.close();
                con.disconnect();

                // Parse JSON
                JSONObject obj = new JSONObject(content.toString());

                String cityName = obj.getString("name");
                JSONObject main = obj.getJSONObject("main");

                double temp = main.getDouble("temp");
                int humidity = main.getInt("humidity");

                JSONObject weather = obj.getJSONArray("weather").getJSONObject(0);
                String description = weather.getString("description");

                System.out.println("\n--- Weather Report ---");
                System.out.println("City      : " + cityName);
                System.out.println("Temperature: " + temp + " °C");
                System.out.println("Humidity  : " + humidity + " %");
                System.out.println("Condition : " + description);

            } else {
                System.out.println("Failed to fetch data. HTTP Code: " + status);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
