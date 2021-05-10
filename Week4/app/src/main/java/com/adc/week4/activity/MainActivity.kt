package com.adc.week4.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.adc.week4.R
import com.adc.week4.data.api.response.NewsItem

class MainActivity : AppCompatActivity() {
    private lateinit var rvNews: RecyclerView
    private var list: ArrayList<NewsItem> = arrayListOf()
    private var title: String = "KINTAL"

    companion object {
        fun start(context: Context) {
            Intent(context, MainActivity::class.java).apply {
                context.startActivity(this)
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = title
    }
}