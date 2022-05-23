FROM openjdk:8-jdk-alpine

ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} app.jar

ENV SPRING_CONFIG_LOCATION=/config/application.properties

ENTRYPOINT ["java","-jar","/app.jar"]