pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven'
    }

    triggers {
        pollSCM('H/5 * * * *')
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }

    post {
        success {
            echo 'Build, tests, and packaging completed successfully.'
        }
        failure {
            echo 'The pipeline failed. Check the Console Output for details.'
        }
    }
}
