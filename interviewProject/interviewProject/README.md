# E-Commerce Spring Boot Application

This is a Spring Boot web application for a simple e-commerce platform. It provides REST API endpoints for managing products, orders, and order items. The application integrates with a PostgreSQL database and uses Docker to run in a container.

## Prerequisites

Before running this application, make sure you have the following installed on your machine:

- Java 17
- Maven
- Docker

## Building the Application

To build the application, follow these steps:

1. Clone this repository to your local machine.
2. Navigate to the project directory in your terminal.
3. Run the following Maven command to build the application:


## Running the Application

To run the application using Docker, follow these steps:

1. Make sure Docker is installed and running on your machine.
2. Navigate to the project directory in your terminal.
3. Run the following Docker Compose command to start the application:


This command will build the Docker image for the application and start the containers for the PostgreSQL database and the Spring Boot application.

## Testing the Application

The application is fully tested using JUnit and Mockito. To run the tests, follow these steps:

1. Navigate to the project directory in your terminal.
2. Run the following Maven command to execute the tests:


This command will run all the unit tests in the application.

## Accessing the API

Once the application is running, you can access the API endpoints using tools like cURL, Postman, or a web browser. The base URL for the API is `http://localhost:8080/api`.

Here are some example API endpoints:

- GET http://localhost:8080/api/products - Get a list of all products
- GET http://localhost:8080/api/products/{id} - Get a product by ID
- POST http://localhost:8080/api/products - Create a new product
- PUT http://localhost:8080/api/products/{id} - Update an existing product
- DELETE http://localhost:8080/api/products/{id} - Delete a product by ID

- GET http://localhost:8080/api/orders - Get a list of all orders
- GET http://localhost:8080/api/orders/{id} - Get an order by ID
- POST http://localhost:8080/api/orders - Create a new order
- PUT http://localhost:8080/api/orders/{id} - Update an existing order
- DELETE http://localhost:8080/api/orders/{id} - Delete an order by ID

- GET http://localhost:8080/api/order-items - Get a list of all order items
- GET http://localhost:8080/api/order-items/{id} - Get an order item by ID
- POST http://localhost:8080/api/order-items - Create a new order item
- PUT http://localhost:8080/api/order-items/{id} - Update an existing order item
- DELETE http://localhost:8080/api/order-items/{id} - Delete an order item by ID

## Documentation

The REST API is documented using OpenAPI 3.0. You can access the API documentation by visiting `http://localhost:8080/swagger-ui.html` in your web browser when the application is running.

## Contribution

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or create a pull request.

