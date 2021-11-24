FROM openjdk:8-jdk-alpine
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} web-controller.jar
ENTRYPOINT ["java", "-jar" ,"web-controller.jar"]