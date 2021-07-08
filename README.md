# JUnit 5 Samples [![ci-badge]][ci-actions]

Welcome to _JUnit 5 Samples_, a collection of sample applications and extensions
using JUnit Jupiter, JUnit Vintage, and the JUnit Platform on various build systems.

CI builds for sample projects are performed by [GitHub Actions][ci-actions]. Using JDK 11+'s
`jshell` tool, you may build all samples via the `build-all-samples.jsh` script.

### Jupiter on Maven ![badge-jdk-8] ![badge-tool-maven] ![badge-junit-jupiter]

The [junit5-jupiter-starter-maven] sample demonstrates the bare minimum configuration for
getting started with JUnit Jupiter using the Maven build system.


[junit5-jupiter-starter-maven]: junit5-jupiter-starter-maven


[badge-jdk-8]: https://img.shields.io/badge/jdk-8-lightgray.svg "JDK-8"
[badge-jdk-11]: https://img.shields.io/badge/jdk-11-red.svg "JDK-11 or higher"
[badge-tool-ant]: https://img.shields.io/badge/tool-ant-10f0f0.svg "Ant"
[badge-tool-gradle]: https://img.shields.io/badge/tool-gradle-blue.svg "Gradle wrapper included"
[badge-tool-maven]: https://img.shields.io/badge/tool-maven-0440af.svg "Maven wrapper included"
[badge-tool-bazel]: https://img.shields.io/badge/tool-bazel-43a047.svg "Bazel"
[badge-tool-console]: https://img.shields.io/badge/tool-console-022077.svg "Command line tools"
[badge-junit-platform]: https://img.shields.io/badge/junit-platform-brightgreen.svg "JUnit Platform"
[badge-junit-jupiter]: https://img.shields.io/badge/junit-jupiter-green.svg "JUnit Jupiter Engine"
[badge-junit-vintage]: https://img.shields.io/badge/junit-vintage-yellowgreen.svg "JUnit Vintage Engine"

[ci-badge]:https://github.com/junit-team/junit5-samples/workflows/Build%20all%20samples/badge.svg "CI build status"
[ci-actions]: https://github.com/junit-team/junit5-samples/actions

[guide-custom-engine]: http://junit.org/junit5/docs/current/user-guide/#launcher-api-engines-custom "Plugging in Your Own Test Engine"
