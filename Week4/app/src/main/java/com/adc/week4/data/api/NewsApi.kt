package com.adc.week4.data.api

import com.adc.week4.data.api.response.ArticlesItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("v2/top-headlines")
    fun getListNews(
        @Query("country") country: String,
        @Query("apiKey") key: String
    ): Call<List<ArticlesItem>>

}