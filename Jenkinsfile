pipeline {
    agent any
    stages {
        stage('clean') {
            steps {
                
                sh 'ant clean'
            }
        }
        stage('build') {
            steps {
                
                sh 'ant build'
            }
        }
    }
}
