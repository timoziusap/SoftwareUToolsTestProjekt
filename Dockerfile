# Teil 1: Projekt mit Maven und Java 26 zur fertigen .jar bauen
FROM maven:3.9-eclipse-temurin-26 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Teil 2: nur die fertige App mit Java 26 starten 
FROM eclipse-temurin:26-jre
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
