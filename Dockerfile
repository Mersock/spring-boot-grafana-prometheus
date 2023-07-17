FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
COPY src/main/resources/application.properties /config/
WORKDIR /
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]