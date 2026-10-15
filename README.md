# Java Addition DevOps Project

A beginner-friendly Java + Maven project designed for GitHub and a Jenkins CI pipeline. It does not use Docker.

## Requirements

- JDK 17
- Apache Maven 3.10.0 (or a compatible Maven 3.x release)
- Git
- Jenkins running on Windows with the Git and Pipeline plugins installed

## Project structure

```text
java-addition-devops/
├── pom.xml
├── Jenkinsfile
├── .gitignore
├── README.md
└── src/
    ├── main/java/Addition.java
    └── test/java/AdditionTest.java
```

## Run locally on Windows

Open a terminal in this project folder and run:

```bat
java -version
mvn -version
mvn clean test
mvn package
```

Run the packaged application:

```bat
java -jar target\java-addition-1.0.0.jar
```

Enter two integers when prompted.

## Jenkins setup

In **Manage Jenkins → Tools**, configure tool names to match the Jenkinsfile:

- JDK installation name: `JDK17`
- Maven installation name: `Maven`

The Jenkins agent must be able to run Windows `bat` commands and access Git and Maven.

Create a **Pipeline** job named `java-addition-pipeline`, choose **Pipeline script from SCM**, select **Git**, enter your GitHub repository URL, set branch to `*/main`, and set Script Path to `Jenkinsfile`.

The pipeline checks out the repository, runs tests, and packages the application. `pollSCM('H/5 * * * *')` asks Jenkins to check SCM for changes approximately every five minutes; detection timing can vary.

## Expected build artifact

After a successful package stage:

```text
target/java-addition-1.0.0.jar
```

## Important

Do not commit passwords, access tokens, or other secrets to GitHub. If Jenkins reports that a configured JDK or Maven tool cannot be found, check that the installation names in **Manage Jenkins → Tools** exactly match the names above.
