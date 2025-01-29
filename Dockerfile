# 1. Base image olarak openjdk:17 kullanıyoruz
FROM openjdk:17-jdk-slim

# 2. Çalışma dizini oluşturuluyor
WORKDIR /app

# 3. JAR dosyasını konteynıra kopyalıyoruz
COPY target/simpleapiforEeedit-0.0.1-SNAPSHOT.jar app.jar

# 4. Uygulamayı başlatan komut
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

# 5. Uygulamanın çalışacağı portu expose ediyoruz (örneğin 8080)
EXPOSE 8080
