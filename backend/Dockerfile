FROM openjdk:8-jdk-alpine

ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} app.jar

ENV SPRING_CONFIG_NAME=application
ENV SPRING_CONFIG_LOCATION=/config

ENTRYPOINT ["java","-jar","/app.jar"]