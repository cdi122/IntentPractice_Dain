package com.example.intentpractice_dain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendMessgageBtn.setOnClickListener {
            val inputMessage = messageEdt.text.toString()
            val myintent = Intent(this, MessageActivity::class.java)
            myintent.putExtra("message", inputMessage)
            startActivity(myintent)
        }

        moveToOtherBtn.setOnClickListener {
            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)
        }
    }
}