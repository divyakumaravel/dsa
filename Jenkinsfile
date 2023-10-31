pipeline {
    agent any

    stages {
        parallel {
            stage("Running Parallel Stages") {
                steps {
                    sh "echo parallel stages"
                }
            }
            stage("Run clean") {
                steps {
                    sh "./gradlew clean"
                }
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