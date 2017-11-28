node {
    stage ('This is a stage') {}
    stage ('Another stage') {}
    stage ('Proceed?') {
        milestone()
        input message: 'Proceed?'
    }
    stage ('Finished') {}
}