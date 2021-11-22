package com.example.midterm_darina_umetalieva

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    val exit = findViewById<ImageView>(R.id.ImageView10)
    exit.setOnClickListener {
        startActivity(Intent(this,MainActivity::class.java))
        finish()
    }
    }
}