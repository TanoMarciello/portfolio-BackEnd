FROM amazoncorretto:17-alpine-jdk
MAINTAINER agustin
EXPOSE 8080
COPY target/afunes-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]