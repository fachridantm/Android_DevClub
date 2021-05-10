package com.adc.week4.data.api.response

import com.google.gson.annotations.SerializedName

data class NewsItem(
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int,
    @SerializedName("articles")
    val articles: List<ArticlesItem>
)
