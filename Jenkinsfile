pipeline {
    agent any

    stages {
        stage("Run clean") {
            steps {
                sh "./gradlew clean"
            }
        }
        stage("Run build") {
            steps {
                sh "./gradlew build"
            }
        }
        stage("Run tests") {
            steps {
                sh "./gradlew test"
            }
        }
    }
}