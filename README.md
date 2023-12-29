# Getting Started

### Prerequisites
- Java 17 SDK
- Docker

### Environment Setup
- Start a Redis Server by using Docker with the following command.

    `docker run -d -p 6379:6379 --name myredis redis`

- Run the Spring Boot application.

# Example Requests
- `curl --location 'http://localhost:8080/products'`
- `curl --location 'http://localhost:8080/products/1'`
- `curl --location 'http://localhost:8080/products/2'`
