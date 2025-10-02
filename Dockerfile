FROM openjdk:17-jdk-slim
WORKDIR /app

RUN apt-get update && apt-get install -y maven && rm -rf /var/lib/apt/lists/*

COPY . .
RUN mvn clean package -DskipTests

CMD ["java", "-jar", "target/redis_project-0.0.1-SNAPSHOT.jar"]