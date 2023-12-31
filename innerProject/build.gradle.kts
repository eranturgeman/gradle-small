val spi: Configuration by configurations.creating

dependencies {
    implementation(project(":project"))

    runtimeOnly('junit:junit:4.7')
    runtimeOnly("junit:junit:4.7")
    implementation('junit:junit:4.7:javadoc')
    implementation(group = 'commons-collections', name = 'commons-collections', version = '3.2.1')
    implementation(group = 'commons-collections',
            name = 'commons-collections', version = '3.2.1')

    runtimeOnly("commons-io:commons-io:1.2") {
        isTransitive = true
    }

    runtimeOnly(group = 'junit', name = 'junit', version = '4.7')
    runtimeOnly(group = "junit", name = "junit",

            version = "4.7")
    runtimeOnly(group = 'junit', name = 'junit', version = '4.7', classifier = 'javadoc')
    runtimeOnly(group = "commons-io", name = "commons-io", version = "1.2") {
        isTransitive = true
    }

    //SHOULD NOT BE FIXED
    //implementation(group = 'commons-collections', name = 'commons-collections', version = '3.+')
    //implementation(group = 'commons-collections', name = 'commons-collections', version = '[3.0, 3.6)')
    //runtimeOnly('commons-collections:commons-collections:latest.release')
}

// Just a smoke test that using this option does not lead to any exception
tasks {
    named<JavaCompile>("compileJava") {
        options.compilerArgs = listOf("-Xlint:unchecked")
    }
}
