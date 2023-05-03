FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine
USER root
ADD ./target/*.jar /opt/Productservice.jar
CMD ["java", "-Xmx200m", "-jar", "/opt/Productservice.jar"]

EXPOSE 8080
