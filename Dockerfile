FROM phenompeople/openjdk17


EXPOSE 8088

WORKDIR /opt/app

ADD target/springboot-image-latest.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
