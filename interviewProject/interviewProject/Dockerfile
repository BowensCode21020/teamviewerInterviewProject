# Use the official OpenJDK 16 slim image as a base
FROM adoptopenjdk:16-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged JAR file into the container
COPY target/interviewProject.jar /app/interviewProject.jar

# Expose port 8080 to the outside world
EXPOSE 8080

# Specify the command to run your Spring Boot application when the container starts
CMD ["java", "-jar", "interviewProject.jar"]
