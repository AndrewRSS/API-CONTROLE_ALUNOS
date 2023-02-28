FROM openjdk:17-alpine
COPY ./build/libs/controlAPI-0.0.1-SNAPSHOT.jar /app/controlAPI-0.0.1-SNAPSHOT.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "controlAPI-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080