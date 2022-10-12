package com.really.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication: Application() {

    companion object {
        const val token = "kdCLe9QgBcfOKY78";
        //Lint是一个静态检查器，它围绕Android项目的正确性、安全性、性能、可用性以及可访问性进行分析。
        //它检查的对象包括XML资源、位图、ProGuard配置文件、源文件甚至编译后的字节码。
        //Lint包含了API版本检查、性能检查以及其他诸多特性。
        //可以使用@SuppressLint标注忽略指定的警告。
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}