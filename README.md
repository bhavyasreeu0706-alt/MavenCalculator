# Maven Calculator

A simple Java Maven project demonstrating:

- Maven project structure
- `pom.xml`
- Java classes
- JUnit 5 unit testing
- Git/GitHub workflow

## Requirements

- JDK 17 or later
- Apache Maven

## Run the tests

Open a terminal inside the project folder and run:

```bash
mvn clean test
```

A successful build should show:

```text
BUILD SUCCESS
```

## GitHub commands

Create an empty repository on GitHub, then run:

```bash
git init
git add .
git commit -m "Initial Maven project"
git branch -M main
git remote add origin YOUR_GITHUB_REPOSITORY_URL
git push -u origin main
```
## Jenkins CI Test

This project is automatically built using Jenkins CI.
Jenkins GitHub Webhook Test