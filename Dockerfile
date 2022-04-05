FROM openjdk:8

ADD target/springboot-docker.jar springboot-docker.jar

EXPOSE 8080
 
ENTRYPOINT ["java","-jar","springboot-docker.jar"]