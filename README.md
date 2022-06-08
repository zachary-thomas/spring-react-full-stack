# spring-react-full-stack

Run maven install to bundle the front end and back end and run it locally with the created jar.

`mvnw clean install
`

Build the docker container:

`
mvn compile jib:dockerBuild -Dimage=fullstack:v1
`

Run on localhost 8080:

`docker run --name fullstack -p 8080:8080 fullstack:v1
`

To push to dockerhub:

`mvn compile jib:dockerBuild -Dimage=fullstack:v1`

Follows this course:
https://github.com/amigoscode/spring-boot-fullstack-professional/
