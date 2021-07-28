package com.jaebin.homework.retrofit

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitClient {

    var okHttpClient: OkHttpClient = OkHttpClient.Builder()
        .connectTimeout(1, TimeUnit.MINUTES)
        .readTimeout(3, TimeUnit.SECONDS)
        .writeTimeout(3, TimeUnit.SECONDS)
        .build()
    val gson: Gson = GsonBuilder().setLenient().create()
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl( JsonUrl.baseUrl)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()


    val service: RetroFitInterface =
        retrofit.create(RetroFitInterface::class.java)


}