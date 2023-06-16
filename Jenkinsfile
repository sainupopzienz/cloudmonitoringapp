@Library('my-shared-library') _

pipeline {
    agent any

    stages {
        stage('Build and Push Docker Image') {
            steps {
                buildAndPushDocker()
            }
        }
    }
}
