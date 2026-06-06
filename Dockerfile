FROM eclipse-temurin:21-jre

EXPOSE 8080

ADD target/springboot-devops-automation.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]