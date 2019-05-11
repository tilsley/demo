var baseImageName = "demo:$version"

task<Exec>("createDockerImage") {
    commandLine("docker", "build", ".", "-t", baseImageName, "--no-cache")
}
