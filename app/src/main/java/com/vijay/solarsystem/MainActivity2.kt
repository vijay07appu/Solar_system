package com.vijay.solarsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    private lateinit var b2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        b2=findViewById(R.id.btn2)
        b2.setOnClickListener {
            val intent=Intent(this@MainActivity2,MainActivity::class.java)
            startActivity(intent)
        }
    }
}