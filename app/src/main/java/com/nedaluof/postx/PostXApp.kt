package com.nedaluof.postx

import android.app.Application
import com.nedaluof.cavx.CAVX
import dagger.hilt.android.HiltAndroidApp

/**
 * Created by nedaluof on 2/6/2021.
 */
@HiltAndroidApp
class PostXApp : Application() {
    override fun onCreate() {
        super.onCreate()
        CAVX.init(this)
    }
}