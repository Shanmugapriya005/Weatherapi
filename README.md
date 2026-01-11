# Weatherapi

COMPANY": CODTECH IT SOLUTIONS

"NAME": SHANMUGAPRIYA S

"INTERN ID": CTISO608

"DOMAIN": JAVA PROGRAMMING

"DURATION": 4 WEEKS

"MENTOR": NEELA SANTOSH

##"DESCRIPTION": This project focuses on developing a Java-based REST API Client that consumes data from a public web service and presents the information in a clear and structured format. The application demonstrates how modern software systems interact with external services using HTTP protocols and JSON data formats. In this implementation, the OpenWeatherMap API is used to fetch real-time weather information based on user input.

The core objective of this project is to understand how Java applications can communicate with remote servers, handle HTTP requests, and parse JSON responses without using advanced build tools such as Maven. Instead, the program relies on standard Java libraries and an external JSON JAR file, making it lightweight and suitable for beginners who are learning API integration fundamentals.

When the application starts, it prompts the user to enter the name of a city. This input is used to dynamically construct a REST API endpoint URL. The program then establishes a connection to the OpenWeatherMap server using HttpURLConnection, sends an HTTP GET request, and waits for the server’s response. If the server responds successfully (HTTP status code 200), the program reads the returned JSON data stream and converts it into a usable string format.

To process the response, the application uses the org.json library. The JSON data is parsed into a JSONObject, allowing the program to extract specific fields such as city name, temperature, humidity, and weather condition. These values are then displayed in a structured and user-friendly format in the console. This transformation from raw JSON to readable output demonstrates how real-world applications convert machine-readable data into meaningful information for users.

The project also includes basic error handling. If the API request fails due to an invalid key, network issue, or incorrect city name, the application reports the corresponding HTTP status code. This helps users and developers understand why the request failed and encourages debugging and validation practices. The use of try-catch blocks ensures that unexpected runtime errors do not crash the program and are handled gracefully.

From a learning perspective, this project strengthens several important concepts:

Working with user input in Java

Constructing and sending HTTP requests

Understanding RESTful services

Parsing and navigating JSON data

Handling exceptions and response codes

Organizing a Java project without Maven

This REST API client serves as a foundation for building more advanced applications such as weather dashboards, data monitoring tools, or integrated systems that rely on third-party services. It mirrors real-world software behavior, where applications frequently depend on external APIs for live data. By implementing this project, students gain practical exposure to how backend services communicate and how Java can be used to integrate distributed systems.

Overall, this project effectively demonstrates the end-to-end flow of data from a public web service to a Java console application, making it an ideal academic assignment for understanding REST API consumption and JSON parsing in Java.

#OUTPUT:<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/923c3d69-1f5d-4cdc-9118-0fc1b98afa3c" />

