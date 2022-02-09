FROM openjdk:11
ADD target/ofg-api-discovery-service-ms-1.0.0.jar ofg-api-discovery-service-ms-1.0.0.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","ofg-api-discovery-service-ms-1.0.0.jar"]
