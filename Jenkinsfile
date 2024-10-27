node {
  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    withSonarQubeEnv('SonarSever') {  // Đảm bảo tên cấu hình SonarQube trong Jenkins là 'Sonar_Sever'
      // Cấp quyền thực thi cho gradlew
      sh 'chmod +x ./gradlew'
      
      // Chạy SonarQube
      sh './gradlew sonarqube'
    }
  }
}
