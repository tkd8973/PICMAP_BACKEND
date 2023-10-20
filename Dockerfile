FROM adoptopenjdk:11-jdk-hotspot

EXPOSE 8082

COPY build/libs/picturemapping-*.jar picturemapping.jar
ENTRYPOINT ["java","-jar","picturemapping.jar"]
