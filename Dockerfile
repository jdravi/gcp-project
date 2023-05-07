# Run the Gradle build in a separate stage
FROM gradle:jdk17 AS build
WORKDIR /app
COPY . .
RUN chmod +x gradlew && ./gradlew --no-daemon clean build -x test

# Use a smaller base image for the final image
FROM openjdk:17
WORKDIR /app
COPY --from=build /app/build/libs/*.jar /app/app.jar

# Specify the command to run the application
CMD ["java", "-jar", "/app/app.jar"]
