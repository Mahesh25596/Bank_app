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
        stage('test') {
            steps {
                
                sh 'ant Main_classTest'
            }
        }
        stage('mutation') {
            steps {
                
                sh 'ant pit'
            }
        }
        stage('bugs') {
            steps {
                
                sh 'ant spotbugs'
            }
        }
    }
    
}
