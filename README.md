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

Run pom profile: (You'll need put in your own credentials)

`mvnw clean install -P build-frontend -P jib-push-to-dockerhub -Dimage=latest
mvnw clean install -P build-frontend -P jib-push-to-local -Dimage=latest`

Create a folder to hold the database and run this command:
`docker run --name db -p 5432:5432 --network=db -v "%cd%:/var/lib/postgresql/data" -e POSTGRES_PASSWORD=password -d postgres:alpine
`
`docker run -it --rm --network=db postgres:alpine psql -h db -U postgres`

Follows this course:
https://github.com/amigoscode/spring-boot-fullstack-professional/
