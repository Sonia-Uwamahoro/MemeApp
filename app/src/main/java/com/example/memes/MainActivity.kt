package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var btnNext : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNext = findViewById(R.id.btnNext)
        btnNext.setOnClickListener {
            var intent = Intent(this,fNextMeme::class.java)
            startActivity(intent)
        }

    }
}