package com.adc.week4.data.api

import android.content.Context
import com.adc.week4.data.api.response.ArticlesItem
import retrofit2.Call

class NewsData : NewsApi{

    companion object{
        private lateinit var newsApi: NewsApi

        fun getInstance(context: Context) : NewsData{
            newsApi = RetrofitService.createService(NewsApi::class.java, OkHttpClientService.create(context))
            return NewsData()
        }
    }

    override fun getListNews(country: String, key: String): Call<List<ArticlesItem>> {
        return newsApi.getListNews("id", "82f6d540990043a3a9957fcf575d19ae")
    }
}
