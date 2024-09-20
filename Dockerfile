FROM openjdk:17
EXPOSE 9091
ADD target/docker-demo-app2.jar docker-demo-app2.jar
ENTRYPOINT ["java","-jar","/docker-demo-app2.jar"]