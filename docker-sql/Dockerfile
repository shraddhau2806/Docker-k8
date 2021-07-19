FROM java:8

 

WORKDIR /app
COPY . /app

 

COPY ./target/tour-rest-sql-service.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]