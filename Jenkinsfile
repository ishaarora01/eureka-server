pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /tmp/.m2:/tmp/.m2'
        }
    }
    options {
        skipStagesAfterUnstable()
    }
    stages {
//         stage('Build') {
//             steps {
//                 sh 'mvn -B -DskipTests clean package'
//             }
//         }
//         stage('Test') {
//             steps {
//                 sh 'mvn test'
//             }
//             post {
//                 always {
//                     junit 'target/surefire-reports/*.xml'
//                 }
//             }
//         }
        stage('Coverage') {
            steps {
                sh 'mvn cobertura:cobertura -Dcobertura.report.format=xml'
            }
            post {
              always {
//              step([$class: 'CoberturaPublisher', autoUpdateHealth: false, autoUpdateStability: false, coberturaReportFile: '**/coverage.xml', failUnhealthy: false, failUnstable: false, maxNumberOfBuilds: 0, onlyStable: false, sourceEncoding: 'ASCII', zoomCoverageChart: false])
                cobertura coberturaReportFile: 'target/site/cobertura/coverage.xml'
                }
            }
        }
    }
}
