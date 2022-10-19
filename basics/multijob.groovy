job('EK example1') {
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

