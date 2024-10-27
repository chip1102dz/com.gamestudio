pipeline {
    agent any
    stages {
        stage('SCM') {
            steps {
                checkout scm
                sh 'chmod +x ./gradlew' // Đặt quyền thực thi ngay sau khi checkout
            }
        }
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarSever') {
                    sh './gradlew sonar'
                }
            }
        }
        stage('Build') {
            steps {
                sh './gradlew clean build'
            }
        }
    }
}
