FROM openjdk:8-jre
VOLUME /tmp
WORKDIR /data
COPY target/greeting-api.jar  /data
ENTRYPOINT ["java" ,"-jar", "greeting-api.jar"]