FROM adoptopenjdk:11-jdk-hotspot

WORKDIR /app

ADD build/libs/PictureMapping.jar PictureMapping.jar
ENTRYPOINT ["java","-jar","PictureMapping.jar"]
