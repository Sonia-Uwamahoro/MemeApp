package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class foNextMeme : AppCompatActivity() {

    lateinit var btnPrevFive: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fo_next_meme)

        btnPrevFive = findViewById(R.id.btnPrevFive)
        btnPrevFive.setOnClickListener {
            var intent = Intent(this, tNextMeme::class.java)
            startActivity(intent)
        }
    }
}