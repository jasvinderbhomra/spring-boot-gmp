# Use a base image with OpenJDK (for Spring Boot applications)
FROM openjdk:8-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the target folder (adjust path if needed)
COPY target/gmp-promet_v1-0.0.1-snapshot.jar /app/app.jar

# Expose the port the app will run on
EXPOSE 8081

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar", "com.gmp.boot"]
