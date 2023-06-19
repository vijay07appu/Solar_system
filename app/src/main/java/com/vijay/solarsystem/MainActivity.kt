package com.vijay.solarsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var b1:Button
    private lateinit var res:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1=findViewById(R.id.b1)
        res=findViewById(R.id.res)
        b1.setOnClickListener {
            val intent=Intent(this@MainActivity,MainActivity2::class.java)
            startActivity(intent)
            res.text="There are 9 planets in the solar system "

        }
    }
}