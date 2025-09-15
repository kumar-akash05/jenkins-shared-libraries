def call(String appName, String tag, String dockerUser) {
    sh "docker build -t ${dockerUser}/${appName}:${tag} ."
}
