package com.example.easygo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class sign_up : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val signin = findViewById<Button>(R.id.signin)
        signin.setOnClickListener {
            Toast.makeText(this,"You have Successfully Created an Account",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,Easygo2::class.java))
        }
    }
}