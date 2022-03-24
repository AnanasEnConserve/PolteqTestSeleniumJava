pipeline {
    agent any

    stages {
            stage("Build") {
                steps {
                      echo "Building project.."
                }
            }
            stage("Test") {
                steps {
                       echo "Running tests.."
                       sh "mvn clean test -Denv=Development -Ddriver=ChromeLocal -Dcucumber.filter.tags='@test'"
                }
            }
            // on a different node, labeled 'test', perform testing using the same workspace as previously
            node('test') {
                // compute complete workspace path, from current node to the allocated disk
                exws(extWorkspace) {
                    try {
                        // run tests in the same workspace that the project was built
                        sh "mvn clean test -Denv=Development -Ddriver=ChromeLocal -Dcucumber.filter.tags='@test'"
                    } catch (e) {
                        // if any exception occurs, mark the build as failed
                        currentBuild.result = 'UNSTABLE'
                        throw e
                    }
                }
            }
    }
}
