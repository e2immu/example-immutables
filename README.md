# Applying e2immu to the Immutables library

## Getting started

Immutables is an annotation processor.
When using IntelliJ with Gradle, add the 

```groovy
plugins {
  id 'org.inferred.processors' version '3.3.0'
}
```

plugin, and activate Immutables using

```groovy
 processor group: 'org.immutables', name: 'value', version: '2.8.2'
```

Generated classes are in `build/generated/sources/annotationProcessor`.
