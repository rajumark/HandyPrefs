# HandyPrefs
simple version of Sharedpreferences with kotlin delegation
![alt text](images/ice.png)

### Dependency

[![](https://jitpack.io/v/rajumark/HandyPrefs.svg)](https://jitpack.io/#rajumark/HandyPrefs)

```Groovy
dependencies {
    implementation 'com.github.rajumark:HandyPrefs:1.0.1'
}
```

```Groovy
	allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

### Setup

```Kotlin
class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        
        HandyPrefs.context=this
    }
}
```
#### Create file that holds variable
```Kotlin

object Prefs {

    var userid by HandyPrefs(String::class.java)

}
```

### Use it as normal variable from anywhere 

##### set value
```Kotlin
    userid = "userid1"
```
##### get value
```Kotlin
    textview.text = userid
```
##### get all keys and values
```Kotlin
    HandyPrefs.getAll()
```
##### clear all
```Kotlin
    HandyPrefs.clear()
```