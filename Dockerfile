# Java 17 bilan ishga tushiramiz
FROM openjdk:17-jdk-slim

# Ishchi papkani yaratamiz
WORKDIR /app

# Barcha fayllarni konteyner ichiga ko‘chiramiz
COPY . .

# Maven wrapper'ga ruxsat beramiz va build qilamiz
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# Jar faylni ishga tushiramiz
CMD ["java", "-jar", "target/redis_project-0.0.1-SNAPSHOT.jar"]

