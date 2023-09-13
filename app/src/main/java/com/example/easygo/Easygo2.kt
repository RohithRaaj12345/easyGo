package com.example.easygo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class Easygo2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_easygo2)

        val res1 = findViewById<ImageButton>(R.id.res1)
        res1.setOnClickListener {
            Toast.makeText(this,"Welcome to THALAPAKATTU",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,Foods::class.java))
        }
    }
}