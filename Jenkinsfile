pipeline {
    agent any
    environment {
        // Sử dụng tên người dùng Docker Hub của bạn
        registry = "chip1102dz/test"
        // ID thông tin xác thực đã cấu hình trong Jenkins
        registryCredential = 'docker_id'
        dockerImage = ''
    }
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
        stage('Building Docker Image') {
            steps {
                script {
                    // Xây dựng hình ảnh Docker
                    dockerImage = docker.build registry
                }
            }
        }
        stage('Upload Docker Image') {
            steps {
                script {
                    // Đẩy hình ảnh Docker lên Docker Hub
                    docker.withRegistry('', registryCredential) {
                        dockerImage.push()
                    }
                }
            }
        }
    }
}
