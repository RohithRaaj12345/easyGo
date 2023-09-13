package com.example.easygo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class Foods : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foods)

        val food1 = findViewById<ImageButton>(R.id.food1)
        food1.setOnClickListener {
            Toast.makeText(this,"Order Placed",Toast.LENGTH_SHORT).show()
        }
        val food2 = findViewById<ImageButton>(R.id.food2)
        food2.setOnClickListener {
            Toast.makeText(this,"Order Placed",Toast.LENGTH_SHORT).show()
        }
        val food3 = findViewById<ImageButton>(R.id.food3)
        food3.setOnClickListener {
            Toast.makeText(this,"Order Placed",Toast.LENGTH_SHORT).show()
        }
        val food4 = findViewById<ImageButton>(R.id.food4)
        food4.setOnClickListener {
            Toast.makeText(this,"Order Placed",Toast.LENGTH_SHORT).show()
        }
        val food5 = findViewById<ImageButton>(R.id.food5)
        food5.setOnClickListener {
            Toast.makeText(this,"Order Placed",Toast.LENGTH_SHORT).show()
        }
        val food6 = findViewById<ImageButton>(R.id.food6)
        food6.setOnClickListener {
            Toast.makeText(this,"Order Placed",Toast.LENGTH_SHORT).show()
        }
        val backbutton = findViewById<Button>(R.id.backbutton)
        backbutton.setOnClickListener {
            startActivity(Intent(this,Easygo2::class.java))
        }
    }
}