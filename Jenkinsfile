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
            post {
                success {
                    sh "echo Tests Succeeded"
                }
                failure {
                    sh "echo Tests Failed"
                }
                always {
                    junit allowEmptyResults: true, skipMarkingBuildUnstable: true, skipPublishingChecks: true, testResults: 'build/test-results/test/*.xml'
                }
            }
        }
    }
}