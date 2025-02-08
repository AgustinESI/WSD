# WSD - Spring Boot Demo Project

## Overview

WSD is a demo Spring Boot application designed to showcase best practices in building scalable and maintainable Java applications using the Spring Boot framework. The project uses Gradle for dependency management and build automation.

## Features

- Spring Boot framework
- Gradle build system
- RESTful APIs
- Embedded Tomcat server
- H2 Database for local development

## Prerequisites

Before running the project, ensure you have the following installed:

- Java 17+
- Gradle 7+
- Git (optional)

## Getting Started

### Clone the Repository

```sh
git clone https://github.com/AgustinESI/WSD.git
cd wsd
```

### Build the Project

```sh
gradle build
```

### Run the Application

```sh
gradle bootRun
```

### Access the Application

Once the application is running, you can access it at:

```
http://localhost:8080/
```

## Project Structure

```
wsd/
├── src/main/java/com/example/wsd  # Application source code
│   ├── controller                 # REST controllers
│   ├── service                    # Business logic layer
│   ├── repository                 # Data access layer
│   ├── model                      # Domain models
│   └── WsdApplication.java        # Main application entry point
├── src/main/resources             # Configuration files
│   ├── application.properties     # Application configuration
├── build.gradle                   # Gradle build script
├── settings.gradle                 # Gradle settings file
└── README.md                       # Project documentation
```

## API Endpoints

| Method | Endpoint   | Description        |
| ------ | ---------- | ------------------ |
| GET    | /api/hello | Returns a greeting |

## Contributing

Contributions are welcome! Feel free to fork the repository and submit pull requests.

## License

This project is licensed under the MIT License.
