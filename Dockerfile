FROM openjdk:8

ADD target/springboot-docker.jar springboot-docker.jar

EXPOSE 9090
 
ENTRYPOINT ["java","-jar","springboot-docker.jar"]
