def envRepoPath = "SeleniumExample"
pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'M3') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'M3') {
                    sh 'mvn -version'
                }
            }
        }
        stage('Fetching the repositories without RSA') {
            steps {
                
                git credentialsId: 'broxsss', url: 'https://github.com/broxsss/SeleniumExample.git' , branch: 'master'
                
            }
        }
        stage('Fetching the repositories with RSA') {
            steps {
                
                sh "chmod 0400 /Users/akshaykumarsaini/.ssh/id_rsa_broxssshub"
                sh "ssh-agent bash -c 'ssh-add /Users/akshaykumarsaini/.ssh/id_rsa_broxssshub; git clone git@github.com:broxsss/${envRepoPath}.git -b master'"
            }
        }
    }
}