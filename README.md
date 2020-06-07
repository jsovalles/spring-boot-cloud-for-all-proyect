# spring-boot-cloud-for-all-proyect
Prueba tecnica de Cloud for all

Proyecto Spring boot con el uso de bases de datos mySQL

# Notes

```
Deploying on heroku only the .jar file:

heroku git:remote -a {HEROKU-APP-NAME}

heroku deploy:jar target/spring-boot-cloud-for-all-proyect-0.0.1-SNAPSHOT.jar

heroku open

heroku logs -- logs for the application if it has any error such as 400 or 500

heroku logs --tail (permanent log)

```

# Desarrollado en

* [Spring STS](https://spring.io/tools) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* Java 11 JDK
