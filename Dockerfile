# Start with a base image containing Java runtime
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy Maven build files
COPY .mvn/ .mvn
COPY mvnw pom.xml ./

# Download dependencies and build the project
RUN ./mvnw dependency:go-offline

# Copy the rest of your source code
COPY src ./src

# Package the application
RUN ./mvnw clean package -DskipTests

# Run the JAR file
CMD ["java", "-jar", "target/SMS-1.0-SNAPSHOT.jar"]
