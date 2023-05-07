# Use a smaller base image
FROM adoptopenjdk/openjdk17:alpine-jre

# Set the working directory to /app
WORKDIR /app

# Copy the source code to the container
COPY . .

# Run the Gradle build in a separate stage
FROM gradle:7.5.4-jdk17
WORKDIR /app
COPY --from=0 /app /app
RUN ./gradlew --no-daemon clean build -x test

# Use the lightweight Alpine distribution as the final base image
FROM adoptopenjdk/openjdk17:alpine-jre
WORKDIR /app
COPY --from=1 /app/build/libs/*.jar /app/app.jar

# Specify the command to run the application
CMD ["java", "-jar", "/app/app.jar"]
