package com.example.easygo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login = findViewById<Button>(R.id.login)
        login.setOnClickListener {
            Toast.makeText(this,"Logged In Successfully.",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,Easygo2::class.java))
        }
        val singin = findViewById<Button>(R.id.signin)
        singin.setOnClickListener {
            Toast.makeText(this,"Sign In Button Clicked",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,sign_up::class.java))
        }
    }
}