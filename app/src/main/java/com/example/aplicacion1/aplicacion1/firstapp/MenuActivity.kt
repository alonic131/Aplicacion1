package com.example.aplicacion1.aplicacion1.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.aplicacion1.R
import com.example.aplicacion1.aplicacion1.firstapp.IMC.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val butMenu = findViewById<Button>(R.id.butMenu)
        val butIMCApp =findViewById<Button>(R.id.butIMCApp)
        butMenu.setOnClickListener {navigateToMenu()}
        butIMCApp.setOnClickListener { navigateTobutIMCApp() }

    }

    private fun navigateTobutIMCApp() {
val intent =Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    fun navigateToMenu(){
        val intent = Intent(this, FirstAppActivity:: class.java)
        startActivity(intent)
    }
}