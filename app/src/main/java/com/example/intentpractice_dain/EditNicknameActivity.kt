package com.example.intentpractice_dain

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        okBtn.setOnClickListener {

//
            val inputNewNickname = newNicknameEdt.text.toString()
            val resultIntent = Intent()
            resultIntent.putExtra("nickname", inputNewNickname)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }

  }
    }