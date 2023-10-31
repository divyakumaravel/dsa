pipeline {
    agent any

    stages {
        stage("Run tests") {
            steps {
                sh "./gradlew test"
            }
        }
    }
}