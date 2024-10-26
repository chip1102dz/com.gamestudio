pipeline {
    agent any
    stages {
        stage('SCM') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                bat "/gradlew build" // Thay 'sh' bằng 'bat' cho Windows
            }
        }
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('Sonar_Sever') {
                    bat "/gradlew sonar" // Thay 'sh' bằng 'bat' cho Windows
                }
            }
        }
    }
}
