plugins {
    java
}

repositories {
  maven {
    name = "papermc"
    url = uri("https://repo.papermc.io/repository/maven-public/")
  }
  maven("https://jitpack.io")
}

dependencies {
  compileOnly("io.papermc.paper:paper-api:1.21.11-R0.1-SNAPSHOT")
  compileOnly("com.github.Breeze-Project:breeze-framework:v1.2.0")
}

java {
  toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}
