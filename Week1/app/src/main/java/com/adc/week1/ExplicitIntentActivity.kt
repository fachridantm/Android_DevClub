package com.adc.week1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_explicit_intent.*

class ExplicitIntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent)

        var number = intent.getIntExtra("DATA", 0)

        tvNumber.text = number.toString()

        btnPlus.setOnClickListener {
            number++
            tvNumber.text = number.toString()
        }

        btnMinus.setOnClickListener {
            number--
            tvNumber.text = number.toString()
        }

        btnReset.setOnClickListener {
            number = intent.getIntExtra("DATA", 0)
            tvNumber.text = number.toString()
        }
    }
}