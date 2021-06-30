plugins {
    id("com.moowork.node") version "1.3.1"

}

apply(plugin = "java")
apply(plugin = "com.moowork.node")

node {
    version = "12.9.1"
    download = true
}

tasks {
    named<com.moowork.gradle.node.npm.NpmTask>("bundle") {
        setArgs(listOf("run", "build"))
    }
    named<com.moowork.gradle.node.npm.NpmTask>("run") {
        setArgs(listOf("start"))
    }
    named<Jar>("webArchive") {
        from(fileTree("build")) {
            into("META-INF/resources")
        }
    }
}

tasks.named("jar") {
    dependsOn("bundle")
    finalizedBy("webArchive")
}