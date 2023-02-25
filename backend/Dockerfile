FROM eclipse-temurin:17-jdk-focal
RUN mkdir /backend
WORKDIR /backend

COPY . /backend
#COPY /build/libs/backend-0.0.1-SNAPSHOT.jar /backend/
RUN gradle build

EXPOSE 8080

# RUN java -jar backend-0.0.1-SNAPSHOT.jar

