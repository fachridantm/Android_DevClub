package com.adc.week4.adapter

import com.adc.week4.data.api.response.ArticlesItem
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.adc.week4.R
import com.adc.week4.utils.setImageUrl

class ListNewsAdapter (
    val context: Context,
    val data: MutableList<ArticlesItem> = mutableListOf(),
    val listener: OnUserItemListener? = null
    ) : RecyclerView.Adapter<ListNewsAdapter.ListNewsViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListNewsViewHolder {
            return ListNewsViewHolder(LayoutInflater.from(context).inflate(R.layout.item_row_news, parent, false))
        }

        override fun getItemCount(): Int = data.size

        override fun onBindViewHolder(holder: ListNewsViewHolder, position: Int) {
            holder.bind(data[position])
        }

        inner class ListNewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var tvTitle: TextView = itemView.findViewById(R.id.tv_title)
            var tvNews: TextView = itemView.findViewById(R.id.tv_news)
            var ivNews: ImageView = itemView.findViewById(R.id.iv_news)
            var pbNews: ProgressBar = itemView.findViewById(R.id.pb_news)
            fun bind(data: ArticlesItem) {
                with(itemView) {
                    ivNews.setImageUrl(context, data.urlToImage, pbNews)
                    tvTitle.text = data.title
                    tvNews.text = data.description
                    setOnClickListener {
                        listener?.onUserItemClicked(data)
                    }
                }
            }
        }

        interface OnUserItemListener {
            fun onUserItemClicked(data: ArticlesItem)
        }
    }