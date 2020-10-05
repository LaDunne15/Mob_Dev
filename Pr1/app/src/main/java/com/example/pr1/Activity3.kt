package com.example.pr1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_3.*

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
    }

    fun setColor(view: View) {

        val b = view as Button

        background2.setBackgroundColor(Color.parseColor("#"+b.text.toString()))
    }
}