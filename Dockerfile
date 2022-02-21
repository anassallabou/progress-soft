FROM openjdk:8-alpine
ADD target/*.jar progress-soft.jar
EXPOSE 8087
ENTRYPOINT ["java","-jar","progress-soft.jar"]
