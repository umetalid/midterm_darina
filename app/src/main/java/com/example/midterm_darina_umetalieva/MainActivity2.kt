package com.example.midterm_darina_umetalieva

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        //body
        val clickExit=findViewById<ImageView>(R.id.imageView2)
        clickExit.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
            finish()
        }

        //body
    }
}