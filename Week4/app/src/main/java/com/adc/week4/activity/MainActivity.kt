package com.adc.week4.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.adc.week4.R
import com.adc.week4.adapter.ListNewsAdapter
import com.adc.week4.data.api.NewsData
import com.adc.week4.data.api.response.ArticlesItem

class MainActivity : AppCompatActivity() {
    private lateinit var rvNews: RecyclerView
    private var list: ArrayList<ArticlesItem> = arrayListOf()
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

        rvNews = findViewById(R.id.rv_news)
        rvNews.setHasFixedSize(true)

        list.addAll(list)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvNews.layoutManager = LinearLayoutManager(this)
        val listNewsAdapter = ListNewsAdapter(this, list)
        rvNews.adapter = listNewsAdapter
    }
}