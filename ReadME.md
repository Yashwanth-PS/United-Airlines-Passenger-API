## 🧍‍♂️ United Airlines Passenger Management API
A Spring Boot-based CRUD REST API for managing passenger details of United Airlines. This project follows modern best practices, with Docker and Kubernetes support for containerized deployment.

### ✈️ United Airlines Passenger API:
- A Spring Boot REST API for managing United Airlines passenger data.
- MiniProject - Java 11 + Spring Boot 2.7.x
- Functionality: CRUD REST API for managing passengers
- Includes: Dockerfile, Kubernetes manifests, and unit tests

### 🚀 Features
- CRUD operations for passengers
- Java 11 + Spring Boot 2.7.18
- Docker + Kubernetes ready
- H2 for dev, configurable for MySQL/PostgreSQL
- Unit tests using Spring MockMvc

### 🏃 Run Locally
```./mvnw spring-boot:run```

### 🐳 Build Docker Image
```docker build -t united-airlines-passenger-api .```

### ☸️ Deploy to Kubernetes
```kubectl apply -f k8s/deployment.yaml```
```kubectl apply -f k8s/service.yaml```

### 📦 Sample Passenger Object
```
{
    "id": 1,
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com"
}
```

### 📥 Create Passenger
#### POST /api/passengers
🔸 Request:
```
{
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com"
}
```
🔸 Response:
```
{
    "id": 1,
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com"
}
```

### 📤 Get All Passengers
#### GET /api/passengers
🔸 Response:
```
[
    {
        "id": 1,
        "firstName": "John",
        "lastName": "Doe",
        "email": "john.doe@example.com"
    }
]
```

### 🔍 Get Passenger by ID
#### GET /api/passengers/{id}
#### Example: /api/passengers/1

🔸 Response:
```
{
    "id": 1,
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com"
}
```
🔸 If Not Found:
```
{}
```

### ✏️ Update Passenger
#### PUT /api/passengers/{id}
#### Example: /api/passengers/1

🔸 Request:
```
{
    "firstName": "Jane",
    "lastName": "Smith",
    "email": "jane.smith@example.com"
}
```
🔸 Response:
```
{
    "id": 1,
    "firstName": "Jane",
    "lastName": "Smith",
    "email": "jane.smith@example.com"
}
```
### ❌ Delete Passenger
#### DELETE /api/passengers/{id}
#### Example: /api/passengers/1

🔸 Response: 204 No Content
(No response body)

### ✅ Status Codes
- 200 OK – Success
- 201 Created – Resource Created
- 204 No Content – Resource Deleted
- 400 Bad Request – Validation/Input Error
- 404 Not Found – Resource Not Found
- 500 Internal Server Error – Unexpected Error

### 🧪 Local Docker Testing Steps
1️⃣ Build the Docker Image
```
docker build -t united-airlines-passenger-api .
```
2️⃣ Run the Docker Container
```
docker run -d -p 8080:8080 --name passenger-api-container united-airlines-passenger-api
```
3️⃣ Check Running Containers
```
docker ps
```
4️⃣ Test API Locally
```
curl http://localhost:8080/api/passengers
```