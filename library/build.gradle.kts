
plugins {
    id("com.android.library")
    id("version-catalog")
    id("maven-publish")
}
catalog {
    versionCatalog {
        from("../libs.versions.toml")
    }
}
publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "io.github.chgocn"
            artifactId = "gradle-catalog"
            version = "0.0.1"
            from(components["versionCatalog"])
        }
    }
}


