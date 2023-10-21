FROM adoptopenjdk:11-jdk-hotspot

ADD ./build/libs/PictureMapping-0.0.1-SNAPSHOT.jar PictureMapping.jar
ENTRYPOINT ["java", "-jar", "PictureMapping.jar"]
