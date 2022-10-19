job('NodeJS example1') {

    triggers {
        scm('H/5 * * * *')
    }
   
    steps {
        shell("npm install")
    }
}

job('NodeJS example2') {

    triggers {
        scm('H/5 * * * *')
    }
    
    steps {
        shell("npm install")
    }
}

