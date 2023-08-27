## Spring Boot Demo

JDK : Java 17 required
Gradle version : 8.2.1

**Run command** : 

```bash
./gradlew bootRun

HTTP GET : http://localhost:8090/hello
HTTP GET : http://localhost:8090/consumeRest

./gradlew clean test
./gradlew clean build
```

**Examples** : 
1. [Employee Payroll](https://spring.io/guides/tutorials/rest/)
2. [Junit test case](https://www.baeldung.com/junit-5-gradle)
4. [Consume REST](https://www.geeksforgeeks.org/how-to-call-or-consume-external-api-in-spring-boot/)
3. https://spring.io/guides/gs/spring-boot/
4. https://codecrunch.org/creating-a-post-and-get-request-springboot-ff6e82a5d46b?gi=1194f3074b6b
5. https://docs.spring.io/spring-boot/docs/1.5.7.RELEASE/reference/html/boot-features-testing.html


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
