package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class tNextMeme : AppCompatActivity() {

    lateinit var btnNextFour: ImageView
    lateinit var btnPrevFour: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tnext_meme)

        btnNextFour = findViewById(R.id.btnNextFour)
        btnNextFour.setOnClickListener {
            var intent = Intent(this,foNextMeme::class.java)
            startActivity(intent)
        }

        btnPrevFour = findViewById(R.id.btnPrevFour)
       btnPrevFour.setOnClickListener {
           var intent = Intent(this,sNextMeme::class.java)
           startActivity(intent)
       }


    }
}