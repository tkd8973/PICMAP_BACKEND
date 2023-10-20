FROM adoptopenjdk:11-jdk-hotspot

EXPOSE 8082

COPY build/libs/PictureMapping-*.jar PictureMapping.jar
ENTRYPOINT ["java","-jar","PictureMapping.jar"]
