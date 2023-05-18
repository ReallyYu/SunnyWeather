package com.really.sunnyweather.logic.network

import com.alibaba.fastjson2.JSONObject
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

interface HisService {

    @POST("/api/login")
    fun login(@Body user: User): Call<HttpResponse<JSONObject>>
}

data class User(var account:String, var password:String)

data class HttpResponse<T>(val code:Int, val msg:String, val ok:Boolean, val data: T)

fun main() {
    val retrofit = Retrofit.Builder()
        .baseUrl("http://192.168.202.71")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val hisService = retrofit.create(HisService::class.java)
    val res = hisService.login(User("1000", "123"))
    println(res)
}
