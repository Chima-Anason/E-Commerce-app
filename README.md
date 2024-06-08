
# E-Commerce Application

## Description

This e-commerce application is designed to streamline and enhance the business operations of an e-commerce store. The application enables efficient management of products, customer interactions, and order processing, including payment handling and notification services.

## Features

- **Product Management**: Add, update, and manage a variety of products, each identified by a unique code and accompanied by a detailed description.
- **Customer Management**: Store and manage customer details, including first name, last name, email, and address.
- **Order Processing**: Handle customer orders efficiently with a dedicated order processing system.
- **Payment Handling**: Process payments through various payment methods and manage payment transactions.
- **Email Notifications**: Automatically send email notifications to customers confirming successful payments or informing them of payment failures and order.
- **Scalability**: Built to support the growth and scalability of the business.

## Architecture

The application consists of several microservices, each responsible for a specific business function:

1. **Product Service**: Manages product data and operations.
2. **Customer Service**: Manages customer information and operations.
3. **Order Service**: Handles order creation, updates, and retrieval.
4. **Payment Service**: Processes payments and manages payment transactions.
5. **Notification Service**: Sends email notifications to customers regarding payment statuses.
6. **API Gateway**: Provides a single entry point for all the microservices and acts as a proxy for incoming requests.
7. **Discovery Server**: Provides a centralized location for service discovery and load balancing.
8. **Config Server**: Provides a centralized location for application configuration.   

## Installation

### Prerequisites

- Java 17
- Maven
- Docker

### Steps

1. Clone the repository:
    ```bash
    git clone https://github.com/Chima-Anason/E-Commerce-app
    ```

2. Navigate to the project directory:
    ```bash
    cd services/{service-name}
    ```

3. Build the project:
    ```bash
    mvn clean install
    ```

4. Configure the database settings in `services/config-server/src/main/resources/configurations/{service-name}.yml` .

## Usage

### Running the Application

To run the application locally:

```bash
java -jar target/{service-name}-0.0.1-SNAPSHOT.jar
```

### Accessing the Application

- API Base URL: `http://localhost:8080/api`

### Example Requests

- **Get Products**: `GET /api/v1/products`
- **Add Customer**: `POST /api/v1/customers`
- **Place Order**: `POST /api/v1/orders`
- **Process Payment**: `POST /api/v1/payments`

## Configuration

Configuration options can be set in the `services/config-server/src/main/resources/configurations/{service-name}.yml` file:

```properties
# Product Service Database Configuration
spring.datasource.url=jdbc:postgresql://localhost:5432/product
spring.datasource.username=root
spring.datasource.password=yourpassword

# Email Configuration
spring.mail.host=localhost
spring.mail.port=1025
spring.mail.username=yourusername
spring.mail.password=yourpassword
```

## Running the Tests

To run the unit tests:

```bash
mvn test
```

## Deployment

### Docker

To deploy the application using Docker:

1. Build the Docker image:
    ```bash
    docker build -t ecommerce-app .
    ```

2. Run the Docker container:
    ```bash
    docker run -p 8080:8080 ecommerce-app
    ```

## Built With

- Spring Boot
- Maven
- PostgreSQL
- MongoDB
- Kafka
- Flyway
- Keycloak
- Mail-dev
- Docker


## Versioning

This project uses Semantic Versioning.

## Authors

- [Chima-Anason](https://github.com/Chima-Anason)

## License

This project is licensed under the MIT License.

## Acknowledgments

- Special thanks to all the contributors and the open-source community for their invaluable support.
