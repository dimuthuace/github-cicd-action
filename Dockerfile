FROM openjdk
EXPOSE 8181
ADD target/springboot-cicd-gitaction.jar springboot-cicd-gitaction.jar
ENTRYPOINT ["java","-jar","/springboot-cicd-gitaction.jar"]