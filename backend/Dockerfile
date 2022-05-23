FROM openjdk:8-jdk-alpine

ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","--spring.config.location=classpath:file:/config/application.properties","-jar","/app.jar"]