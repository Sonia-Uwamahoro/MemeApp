package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class sNextMeme : AppCompatActivity() {

    lateinit var btnNextThree: ImageView
    lateinit var btnPrevThree: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snext_meme)

        btnNextThree = findViewById(R.id.btnNextThree)
        btnNextThree.setOnClickListener {
            var intent = Intent(this, tNextMeme::class.java)
            startActivity(intent)
        }

        btnPrevThree = findViewById(R.id.btnPrevThree)
        btnPrevThree.setOnClickListener {
            var intent = Intent(this, fNextMeme::class.java)
            startActivity(intent)
        }
    }
}