## Spring Boot Demo

JDK : Java 17 required

**Run command** : 

```shell
./gradlew bootRun

HTTP GET : http://localhost:8090/hello
```

**Examples** : 
1. [Employee Payroll](https://spring.io/guides/tutorials/rest/)
2. https://spring.io/guides/gs/spring-boot/
3. https://codecrunch.org/creating-a-post-and-get-request-springboot-ff6e82a5d46b?gi=1194f3074b6b


## Quick Links 
1. [Main Class](src/main/java/com/example/springBootDemo/DemoApplication.java)
2. [Hello Controller](src/main/java/com/example/springBootDemo/HelloController.java)
3. [Application Properties](src/main/resources/application.properties)
5. [CRUD using JPA](src/main/java/com/example/springBootDemo/EmployeeController.java)


## Employee Payroll curl commands
```bash
curl localhost:8090/employees
curl localhost:8090/employees/1
curl localhost:8090/employees/99
curl -X POST localhost:8090/employees -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}'
curl -X PUT localhost:8090/employees/3 -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "ring bearer"}'
curl -X DELETE localhost:8090/employees/3
```
