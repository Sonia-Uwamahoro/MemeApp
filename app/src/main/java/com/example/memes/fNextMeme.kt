package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class fNextMeme : AppCompatActivity() {

    lateinit var btnNextTwo: ImageView
    lateinit var btnPrevTwo: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fnext_meme)
        btnNextTwo = findViewById(R.id.btnNextTwo)
        btnNextTwo.setOnClickListener {
            val intent = Intent(this,sNextMeme::class.java)
            startActivity(intent)
        }

        btnPrevTwo = findViewById(R.id.btnPrevTwo)
        btnPrevTwo.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
