job('NodeJS example1') {
    scm {
        git('git://github.com/kelmane/docker-cicd.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('DSL yaniv')
            node / gitConfigEmail('jenkins-dsl@newtech.academy')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
   
    steps {
        shell("npm install")
    }
}

job('NodeJS example2') {
    scm {
        git('git://github.com/kelmane/docker-cicd.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('DSL yaniv')
            node / gitConfigEmail('jenkins-dsl@newtech.academy')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    
    steps {
        shell("npm install")
    }
}

