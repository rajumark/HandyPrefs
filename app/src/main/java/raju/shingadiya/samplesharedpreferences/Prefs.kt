package raju.shingadiya.samplesharedpreferences

import raju.shingadiya.handyprefs.HandyPrefs

object Prefs {

    var userid by HandyPrefs(String::class.java)
    var userName by HandyPrefs(String::class.java)
    var Age by HandyPrefs(Int::class.java)

}