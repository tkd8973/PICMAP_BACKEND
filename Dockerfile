FROM adoptopenjdk:11-jdk-hotspot

WORKDIR /app

COPY . .

COPY . /build


ADD build/libs/PictureMapping.jar PictureMapping.jar
ENTRYPOINT ["java","-jar","PictureMapping.jar"]
