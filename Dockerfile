FROM adoptopenjdk:11-jdk-hotspot

EXPOSE 8082

ADD build/libs/picturemapping.jar picturemapping.jar
ENTRYPOINT ["java","-jar","picturemapping.jar"]
