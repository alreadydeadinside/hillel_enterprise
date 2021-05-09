FROM adoptopenjdk:11-jre-hotspot
COPY ./targer/demo-1.0.jar /usr/app
WORKDIR usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo-1.0.jar"]