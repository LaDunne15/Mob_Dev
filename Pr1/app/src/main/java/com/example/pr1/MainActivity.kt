package com.example.pr1

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var isMagenta = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        isMagenta++
        if(isMagenta%2 == 1)
        view.setBackgroundColor(Color.rgb(255,0,255))
        else
            view.setBackgroundColor(Color.rgb(0,255,0))

        textView2.text = isMagenta.toString()

//        Toast.makeText(this,"Ця кнопка була нажата "+isMagenta.toString()+"раз",Toast.LENGTH_SHORT).show()


    }

    fun sendMessage2(view: View) {
        val intent = Intent(this, Activity2::class.java).apply {
            putExtra(EXTRA_MESSAGE, isMagenta.toString())
        }
        startActivity(intent)
    }

    fun chColor(view: View) {

        view.setBackgroundColor(Color.rgb(255,0,0))
    }

    fun sendMessage3(view: View) {
        val intent = Intent(this, Activity3::class.java)
        startActivity(intent)
    }


}