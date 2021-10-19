FROM openjdk:8-jdk-alpine
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} analytics.jar
ENTRYPOINT ["java", "-jar" ,"analytics.jar"]