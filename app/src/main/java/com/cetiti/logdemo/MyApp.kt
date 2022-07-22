package com.cetiti.logdemo

import android.app.Application
import com.cetiti.loglib.LogUtils

/**
 *    author : ChenShengDan
 *    date   : 2022/7/22
 *    desc   :
 */
class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        LogUtils.init(this)
    }
}