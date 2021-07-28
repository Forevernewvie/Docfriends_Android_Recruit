package com.jaebin.homework.retrofit

import com.jaebin.homework.data.Datas
import retrofit2.Call
import retrofit2.http.GET

interface RetroFitInterface {

    @GET(JsonUrl.url)
    fun getDataList(): Call<Datas>


}