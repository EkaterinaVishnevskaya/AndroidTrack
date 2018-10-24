package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onBackPressed() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        val txt = findViewById<TextView>(R.id.textView)
        var f = true
        var i : Int
        val secinmillis = 1000.toLong()
        val x= 1000.toLong()
        val timer = object : CountDownTimer(x*secinmillis, secinmillis) {
            override fun onFinish() {
                f = true
                btn.text = getString(R.string.start)
                i = 0
            }

            override fun onTick(millisUntilFinished: Long) {
                i = (x-millisUntilFinished/secinmillis).toInt()
                txt.text = NumToStr.convert(i)
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
