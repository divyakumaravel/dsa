pipeline {
    agent any

    stages {
        stage("Run tests") {
            tools {
                jdk 'jdk-17.0.1+12'
            }
            steps {
                sh "./gradlew test"
            }
        }
    }
}