## Spring Boot Demo

**Prerequisites** :

    JDK : Java 17
    Gradle version : 8.2.1

**Run command(Bash)** : 

```bash
./gradlew clean test (Run testcases)
./gradlew clean build (Build jar)
./gradlew bootRun (Run the application)
```

**Test URL**

    HTTP GET : http://localhost:8090/hello
    HTTP GET : http://localhost:8090/consumeRest

## Swagger Links

    UI: http://localhost:8090/swagger-ui.html
    Json: http://localhost:8090/v3/api-docs
    Yaml: http://localhost:8090/v3/api-docs.yaml

## Examples 
1. [Employee Payroll](https://spring.io/guides/tutorials/rest/)
2. [Junit test case](https://www.baeldung.com/junit-5-gradle)
4. [Consume REST](https://www.geeksforgeeks.org/how-to-call-or-consume-external-api-in-spring-boot/)
3. https://spring.io/guides/gs/spring-boot/
4. https://codecrunch.org/creating-a-post-and-get-request-springboot-ff6e82a5d46b?gi=1194f3074b6b
5. https://docs.spring.io/spring-boot/docs/1.5.7.RELEASE/reference/html/boot-features-testing.html
6. https://stackoverflow.com/questions/50618350/swagger-with-spring-boot-2-0-leads-to-404-error-page/68290972#68290972
7. [Swagger](https://www.baeldung.com/spring-rest-openapi-documentation)


## Quick Links 

1. [Main Class](src/main/java/com/example/springBootDemo/DemoApplication.java)
2. [Hello Controller](src/main/java/com/example/springBootDemo/HelloController.java)
3. [Application Properties](src/main/resources/application.properties)
5. [CRUD using JPA and H2 DB](src/main/java/com/example/springBootDemo/EmployeeController.java)
6. [Junit test case](src/test/java/com/example/springBootDemo/DemoApplicationTests.java)
7. [Consuming REST Controller](src/main/java/com/example/springBootDemo/ConsumingRestController.java)


## Employee Payroll curl commands

```bash
curl localhost:8090/employees
curl localhost:8090/employees/1
curl localhost:8090/employees/99
curl -X POST localhost:8090/employees -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}'
curl -X PUT localhost:8090/employees/3 -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "ring bearer"}'
curl -X DELETE localhost:8090/employees/3
```

**Note** : This application uses H2 database which is an in-memory database to save employee details.

Banner creation : https://patorjk.com/software/taag/#p=display&f=Big&t=SpringBootDemo
