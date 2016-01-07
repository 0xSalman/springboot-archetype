Maven archetype to setup a small springboot web application. It gives you a starting point:
1. `bower.json`
2. static resources
3. `.yml` configuration file
4. monogdb datasource
5. logback configuration and logging utility class
6. skeleton class to read `.yml` file using `@ConfigurationProperties(prefix=)`

## To use

1. Run `mvn install`
2.
```
mvn archetype:generate
    -DgroupId={project-packaging}
    -DartifactId={project-name}
    -DarchetypeGroupId=com.lucidspring
    -DarchetypeArtifactId=springboot-archetype
    -DarchetypeVersion=1.2
    -DinteractiveMode=false
```
