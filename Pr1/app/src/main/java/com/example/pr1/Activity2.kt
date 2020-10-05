package com.example.pr1

import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_2.*
import kotlinx.android.synthetic.main.activity_main.*

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val isMagenta = intent.getStringExtra(EXTRA_MESSAGE)

        textView3.text = isMagenta

    }

    fun alerttext(view: View) {
        val v = view as TextView
        Toast.makeText(this,"В даній комірці - "+ v.text, Toast.LENGTH_SHORT).show()
    }


}