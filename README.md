# Spring Boot CRUD with Hibernate and Oracle

This project is a simple Spring Boot application that demonstrates basic CRUD operations using Hibernate with an Oracle database. The project is designed to serve as a starting point for building more complex applications with similar technologies.

## Technologies Used

- **Spring Boot 3.2.1**: A framework for building stand-alone, production-grade Spring-based applications.
- **Spring Data JPA**: A Spring module that provides a simplified data access layer with an ORM framework, using Hibernate as the JPA implementation.
- **Oracle Database 19c**: The Oracle JDBC driver (`ojdbc8`) is used to connect to Oracle Database 19c.
- **Java 17**: The application is built and runs on Java 17.
- **Maven**: Used for project build and dependency management.

## Project Structure

- **`src/main/java`**: Contains the main Java source code, including the application entry point and business logic.
- **`src/main/resources`**: Contains the application configuration files, such as `application.properties`.
- **`src/test/java`**: Contains test cases for unit and integration testing.

## Prerequisites

- **JDK 17**: Ensure that you have JDK 17 installed.
- **Maven**: Maven is required to build the project.
- **Oracle Database**: You need to have an Oracle Database instance running, with access credentials.

## Getting Started

1. **Clone the repository**:
    ```bash
    git clone https://github.com/kelsonthony/springboot-crud-hibernate-oracle.git
    cd springboot-crud-hibernate-oracle
    ```

2. **Configure the application**:
   Update the `src/main/resources/application.properties` file with your Oracle database credentials and connection URL.

3. **Build the project**:
    ```bash
    mvn clean install
    ```

4. **Run the application**:
    ```bash
    mvn spring-boot:run
    ```

5. **Access the application**:
   The application will start on `http://localhost:8094` by default. You can test the CRUD operations by sending HTTP requests to the appropriate endpoints.

## Testing

To run the tests, use the following command:

```bash
mvn test
