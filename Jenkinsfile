pipeline {
    agent any

    stages {
        stage("Running Parallel Stages") {
            parallel {
                stage("Echoing ...") {
                    steps {
                        sh "echo Cleaning"
                    }
                }
                stage("Run clean") {
                    steps {
                        sh "./gradlew clean"
                    }
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