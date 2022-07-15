package com.example.intentpractice_dain

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val REQUEST_FOR_NICKNAME = 1005
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editNicknameBtn.setOnClickListener {
            val myIntent = Intent(this, EditNicknameActivity::class.java)
            startActivityForResult(myIntent, REQUEST_FOR_NICKNAME)
        }

        sendMessgageBtn.setOnClickListener {
            val inputMessage = messageEdt.text.toString()
            val myIntent = Intent(this, MessageActivity::class.java)
            myIntent.putExtra("message", inputMessage)
            startActivity(myIntent)
        }

        moveToOtherBtn.setOnClickListener {
            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_FOR_NICKNAME) {
            if (resultCode == Activity.RESULT_OK) {
                val newNickname = data?.getStringExtra("nickname")
                nickNameTxt.text=newNickname
            }
        }
    }
}