package com.adc.week1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnImplicit.setOnClickListener {
            val intent =  Intent(this, ImplicitIntentActivity::class.java)
            startActivity(intent)
        }

        btnExplicit.setOnClickListener {
            val intent =  Intent(this, ExplicitIntentActivity::class.java)
            intent.putExtra("DATA", 5)
            startActivity(intent)
        }
    }
}