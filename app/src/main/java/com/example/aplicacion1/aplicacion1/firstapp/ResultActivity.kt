package com.example.aplicacion1.aplicacion1.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.aplicacion1.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val texResult =findViewById<TextView>(R.id.texResult)
        val name: String= intent.extras?.getString("NOMBREX").orEmpty()
        texResult.text ="Hola $name"
    }
}