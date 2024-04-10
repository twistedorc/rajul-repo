pipeline {
    agent any
    stages {
        stage('clone and list') {
            steps {
                git branch: 'dev', url: 'https://github.com/twistedorc/rajul-repo.git'
                sh 'ls -l'
            }
        }
    }
}