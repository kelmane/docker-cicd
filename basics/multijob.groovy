job('NodeJS example') {
    scm {
        git('http://github.com/wardviaene/docker-demo.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('DSL yaniv')
            node / gitConfigEmail('jenkins-dsl@newtech.academy')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}

job('EK example2') {
    scm {
        git('https://github.com/kelmane/docker-cicd.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('DSL yaniv')
            node / gitConfigEmail('blahblah@bla.bla')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    steps {
        shell("docker build -t test:test .")
    }
}

