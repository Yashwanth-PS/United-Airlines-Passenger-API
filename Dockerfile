# MultiStage Dockerfile
# Stage 1: Build the application
FROM maven:3.8.6-openjdk-11-slim AS builder
WORKDIR /app
COPY . /app
RUN mvn clean package -DskipTests

# Stage 2: Production image
FROM  maven:3.8.6-openjdk-11-slim
WORKDIR /app
COPY --from=builder /app/target/united-airlines-passenger-api-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java -jar app.jar"]