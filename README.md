## CI/CD Java 21 Demo

### Local
- Build + test: `mvn test`
- Verify: `mvn verify`
- Package runnable jar: `mvn package`
- Run: `java -jar target/cicd-java21-demo-all.jar`

### CI
- Runs on push/PR to main: `mvn verify`

### CD
- Create a tag like `v1.0.0` and push it.
- GitHub Actions will create a Release and attach `target/cicd-java21-demo-all.jar`.
