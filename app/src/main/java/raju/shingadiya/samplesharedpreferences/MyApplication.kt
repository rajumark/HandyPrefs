package raju.shingadiya.samplesharedpreferences

import android.app.Application
import raju.shingadiya.handyprefs.HandyPrefs


class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        HandyPrefs.context=this
    }
}