Maven archetype to setup a small springboot web application. It gives you a starting point:

1. `bower.json`
2. static resources
3. `.yml` configuration file
4. monogdb datasource
5. logback configuration and logging utility class
6. skeleton class to read `.yml` file using `@ConfigurationProperties(prefix=)`

## Instructions

1. To install in local repo: run `mvn install`
2. To use
```
mvn archetype:generate
    -DgroupId={project-packaging}
    -DartifactId={project-name}
    -DarchetypeGroupId=com.lucidspring
    -DarchetypeArtifactId=springboot-archetype
    -DarchetypeVersion=1.2
    -DinteractiveMode=false
```
