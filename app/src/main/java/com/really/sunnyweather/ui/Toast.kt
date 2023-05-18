package com.really.sunnyweather.ui

import android.widget.Toast
import com.really.sunnyweather.SunnyWeatherApplication

fun String.showToast( duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(SunnyWeatherApplication.context, this, duration).show()
}

fun Int.showToast(duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(SunnyWeatherApplication.context, this, duration).show()
}