Project
Maven ProjectGradle Project
Language
JavaKotlinGroovy
Spring Boot
3.0.0 (SNAPSHOT)3.0.0 (M4)2.7.3 (SNAPSHOT)2.7.22.6.11 (SNAPSHOT)2.6.10
Project Metadata
Group
Artifact
Name
Description
Package name
Packaging
JarWar
Java
1817118
Dependencies
Spring Boot Actuator Ops
Supports built in (or custom) endpoints that let you monitor and manage your application - such as
application health, metrics, sessions, etc.
Validation I/O
Bean Validation with Hibernate validator.
Spring Web Web
Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default
embedded container.
Spring Boot DevTools Developer Tools
Provides fast application restarts, LiveReload, and configurations for enhanced development
experience.
Spring Configuration Processor Developer Tools
Generate metadata for developers to offer contextual help and "code completion" when working with
custom configuration keys (ex.application.properties/.yml files).
Spring Native [Experimental] Developer Tools
Incubating support for compiling Spring applications to native executables using the GraalVM
native-image compiler.
demo.zip

.gitignore
HELP.md
build.gradle.kts
gradle

wrapper

gradle-wrapper.jar

        gradle-wrapper.properties

gradlew
gradlew.bat
settings.gradle.kts

    src

DownloadCopyPreview

# Read Me First

The following was discovered as part of building this project:

* The native build tools is not configured with the Kotlin DSL,
  check [the documentation](https://docs.spring.io/spring-native/docs/0.12.1/reference/htmlsingle/#_add_the_native_build_tools_plugin)
  for more details.
* The following dependencies are not known to work with Spring Native: 'Spring Boot DevTools, Spring
  Configuration Processor'. As a result, your application may not work as expected.

# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.2/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.2/gradle-plugin/reference/html/#build-image)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.7.2/reference/htmlsingle/#actuator)
* [Validation](https://docs.spring.io/spring-boot/docs/2.7.2/reference/htmlsingle/#io.validation)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.2/reference/htmlsingle/#web)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.7.2/reference/htmlsingle/#using.devtools)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/2.7.2/reference/htmlsingle/#appendix.configuration-metadata.annotation-processor)
* [Spring Native Reference Guide](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
* [Configure the Spring AOT Plugin](https://docs.spring.io/spring-native/docs/0.12.1/reference/htmlsingle/#spring-aot-gradle)

## Spring Native

This project has been configured to let you generate either a lightweight container or a native
executable.

### Lightweight Container with Cloud Native Buildpacks

If you're already familiar with Spring Boot container images support, this is the easiest way to get
started with Spring Native.
Docker should be installed and configured on your machine prior to creating the image,
see [the Getting Started section of the reference guide](https://docs.spring.io/spring-native/docs/0.12.1/reference/htmlsingle/#getting-started-buildpacks)
.

To create the image, run the following goal:

```
$ ./gradlew bootBuildImage
```

Then, you can run the app like any other container:

```
$ docker run --rm -p 8080:8080 demo:0.0.1-SNAPSHOT
```

### Executable with Native Build Tools

Use this option if you want to explore more options such as running your tests in a native image.
The GraalVM native-image compiler should be installed and configured on your machine,
see [the Getting Started section of the reference guide](https://docs.spring.io/spring-native/docs/0.12.1/reference/htmlsingle/#getting-started-native-build-tools)
.

To create the executable, run the following goal:

```
$ ./gradlew nativeBuild
```

Then, you can run the app as follows:

```
$ build/native-image/demo
```
