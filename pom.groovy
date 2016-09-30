project {
  modelVersion '4.0.0'
  parent {
    groupId 'org.springframework.boot'
    artifactId 'spring-boot-starter-parent'
    version '1.4.1.RELEASE'
    relativePath ''
  }
  groupId 'com.github.luismoramedina'
  artifactId 'groovy-pom'
  version '0.0.1-SNAPSHOT'
  name 'groovy-pom'
  description 'Demo project for Spring Boot'
  properties {
    'project.reporting.outputEncoding' 'UTF-8'
    'java.version' '1.8'
    'project.build.sourceEncoding' 'UTF-8'
  }
  dependencies {
    dependency {
      groupId 'org.springframework.boot'
      artifactId 'spring-boot-starter-web'
    }
    dependency {
      groupId 'org.springframework.boot'
      artifactId 'spring-boot-starter-test'
      scope 'test'
    }
  }
  build {
    $execute(id: 'hello', phase: 'clean') {
      println "HELLO FROM POM!!! ALL IS CLEAN NOW"
    }
    plugins {
      plugin {
        groupId 'org.springframework.boot'
        artifactId 'spring-boot-maven-plugin'
        configuration {
          mainClass 'com.example.GroovyPomApplication'
          layout 'zip'
        }
      }
    }
  }
}
