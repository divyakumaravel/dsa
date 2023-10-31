pipeline {
    agent any

    stages {
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