package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById(R.id.button) as Button
        val txt = findViewById(R.id.textView) as TextView
        var f = true
        var i = 0
        var timer = object : CountDownTimer(2000, 1000) {
            override fun onFinish() {
                f = true
                btn.setText(getString(R.string.start))
                i = 0
            }

            override fun onTick(millisUntilFinished: Long) {
                i++
                txt.setText(i.toString()) //TODO function int -> string
            }
        }
        btn.setOnClickListener {
            if (f){
                f = false
                btn.setText(getString(R.string.stop))
                timer.start()
            } else
            {
                f = true
                btn.setText(getString(R.string.start))
                timer.cancel()
            }
        }
    }
}