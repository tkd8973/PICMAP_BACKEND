FROM adoptopenjdk:11-jdk-hotspot

ADD build/libs/PictureMapping.jar PictureMapping.jar
ENTRYPOINT ["java","-jar","PictureMapping.jar"]
