# Spring Boot REST API with AOP

This project demonstrates the implementation of Aspect-Oriented Programming (AOP) in a Spring Boot REST API. It includes various cross-cutting concerns like logging, performance monitoring, and input validation using Spring AOP.

## Table of Contents
- [Features](#features)
- [Technologies](#technologies)
- [Project Structure](#project-structure)
- [AOP Aspects](#aop-aspects)
  - [1. LoggingAspect](#1-loggingaspect)
  - [2. PerformanceMonitorAspect](#2-performancemonitoraspect)
  - [3. ValidationAspect](#3-validationaspect)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [AOP Configuration](#aop-configuration)
- [Contributing](#contributing)
- [License](#license)

## Features

- **Logging**: Comprehensive method call logging
- **Performance Monitoring**: Method execution time tracking
- **Input Validation**: Automatic validation of method parameters
- **RESTful API**: CRUD operations for job postings

## Technologies

- Java 8+
- Spring Boot 2.7.x
- Spring AOP
- Maven
- SLF4J for logging

## Project Structure

```
src/main/java/com/example/SpringBootRest/
├── SpringBootRestApplication.java  # Main application class
├── aop/                           # AOP aspects
│   ├── LoggingAspect.java         # Logging functionality
│   ├── PerformanceMonitorAspect.java # Performance monitoring
│   └── ValidationAspect.java      # Input validation
├── controller/                    # REST controllers
│   └── JobRestController.java     # Job posting endpoints
├── model/                         # Data models
│   └── JobPost.java               # Job post entity
├── repository/                    # Data access layer
│   └── JobRepository.java         # Job post repository
└── service/                       # Business logic
    └── JobService.java            # Job post service
```

## AOP Aspects

### 1. LoggingAspect

Provides method call logging with different advice types:
- `@Before`: Logs method calls
- `@After`: Logs method completion
- `@AfterThrowing`: Logs method failures
- `@AfterReturning`: Logs successful method execution

### 2. PerformanceMonitorAspect

Monitors and logs method execution time using `@Around` advice.

### 3. ValidationAspect

Validates and processes method parameters before execution, with the ability to modify them if needed.

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven 3.6.0 or higher
- Your favorite IDE (IntelliJ IDEA, Eclipse, etc.)

### Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd SpringBootRest
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

### Running the Application

1. Run the application using Maven:
   ```bash
   mvn spring-boot:run
   ```

2. The application will start on `http://localhost:8080`

## API Endpoints

The following endpoints are available:

- `GET /jobPosts` - Get all job posts
- `GET /jobPost/{postId}` - Get a specific job post by ID
- `POST /jobPost` - Create a new job post
- `PUT /jobPost` - Update an existing job post
- `DELETE /jobPost/{postId}` - Delete a job post

## AOP Configuration

To enable AOP in your Spring Boot application, ensure you have the following dependency in your `pom.xml`:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-aop</artifactId>
</dependency>
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
