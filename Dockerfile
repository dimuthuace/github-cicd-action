FROM openjdk
EXPOSE 8080
ADD target/springboot-cicd-gitaction.jar springboot-cicd-gitaction.jar
ENTRYPOINT ["java","-jar","/springboot-cicd-gitaction.jar"]