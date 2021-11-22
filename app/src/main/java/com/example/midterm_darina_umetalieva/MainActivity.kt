package com.example.midterm_darina_umetalieva

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    val textView = findViewById<ImageView>(R.id.ImageView9)

    ImageView.text= "Click"

    ImageView.setOnClickListener {
        startActivity(Intent(this,MainActivity2::class.java))
        finish()
    }
    }
}