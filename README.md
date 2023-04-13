

## 如何使用

添加远程仓库根据创建项目的 Gradle 版本有所不同
在Gradle7.6 以前 在项目根目录的 settings.gradle 添加

```groovy
enableFeaturePreview("VERSION_CATALOGS")
```
在Gradle7.6+ 无需开启，默认为开启状态

然后在 项目根目录 的 settings.gradle 添加
```groovy
dependencyResolutionManagement {
    versionCatalogs {
    	libs {
            from("io.github.chgocn:gradle-catalog:0.0.1")
        }
    }
}
```
如果采用kts的gradle文件，则如下：
```kotlin
enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from("io.github.chgocn:gradle-catalog:0.0.1")
        }
    }
}
```
引入后就可以在module以及app模块中使用对应的依赖kts为例子。
```kotlin

android {
    compileSdk = libs.versions.compileSdk.get().toInt()
    defaultConfig {
        applicationId = "自己的包名"
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()
    }
}

dependencies {
    api(libs.baseLib)
    kapt(libs.arouter.compiler)
}
```

## License

```
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
