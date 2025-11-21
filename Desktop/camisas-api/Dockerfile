# ---- Etapa 1: Build ----
# Usamos una imagen de JDK completa para compilar la aplicación
FROM eclipse-temurin:21-jdk-alpine AS build

# Establecemos el directorio de trabajo
WORKDIR /workspace/app

# Copiamos los archivos de Gradle para descargar dependencias
COPY gradlew .
COPY gradle gradle
COPY build.gradle.kts .
COPY settings.gradle.kts .

# Copiamos el código fuente de la aplicación
COPY src src

# Damos permisos de ejecución al wrapper de Gradle y compilamos el proyecto saltando los tests
# Esto generará el archivo .jar en build/libs
RUN chmod +x ./gradlew && ./gradlew build -x test --no-daemon

# ---- Etapa 2: Run ----
# Usamos una imagen JRE más ligera para ejecutar la aplicación
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

# Copiamos el archivo .jar generado en la etapa 'build'
COPY --from=build /workspace/app/build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
