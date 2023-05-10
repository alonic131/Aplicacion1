package com.example.aplicacion1.aplicacion1.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.aplicacion1.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        val butStart = findViewById<AppCompatButton>(R.id.butStart)
        val texName = findViewById<AppCompatEditText>(R.id.texName)

        butStart.setOnClickListener {
            val name = texName.text.toString()
            if (name.isNotEmpty()) {
                val intent = Intent(this,ResultActivity:: class.java)
                intent.putExtra("NOMBREX", name )
                startActivity(intent)
            }
        }
    }
}