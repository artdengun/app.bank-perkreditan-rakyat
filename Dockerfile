FROM openjdk:8
EXPOSE 8080
ADD target/app.bank-perkreditan-rakyat-0.0.1-SNAPSHOT.jar app.bank-perkreditan-rakyat.jar
ENTRYPOINT ["java","-jar","/app.bank-perkreditan-rakyat.jar"]
