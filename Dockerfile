# Java 17 yoki kerakli versiyani tanlang
FROM openjdk:17-jdk-slim

# ishchi papka yaratamiz
WORKDIR /app

# proyektni ichkariga ko‘chiramiz
COPY src .

# Maven orqali build qilish (agar maven-wrapper yoki target jar bo‘lsa)
RUN ./mvnw clean package -DskipTests

# Jar faylni ishga tushiramiz
CMD ["java", "-jar", "target/redis_project-0.0.1-SNAPSHOT.jar"]
