package com.adc.week4.data.api

import com.adc.week4.data.api.response.ArticlesItem
import retrofit2.Call
import retrofit2.http.GET

interface NewsApi {
    @GET("v2/top-headlines?country=id&apiKey=82f6d540990043a3a9957fcf575d19ae")
    fun listNews(

    ): Call<List<ArticlesItem>>

}