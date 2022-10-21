FROM openjdk:8
EXPOSE 8090
ADD /target/FactureMS-0.0.1-SNAPSHOT.jar FactureMS.jar
ENTRYPOINT ["java","-jar","FactureMS.jar"]