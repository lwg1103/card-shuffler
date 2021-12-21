FROM amazoncorretto:11-alpine-jdk
MAINTAINER dc
COPY target/shuffler-0.0.1-SNAPSHOT.war shuffler-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/shuffler-0.0.1-SNAPSHOT.war"]
