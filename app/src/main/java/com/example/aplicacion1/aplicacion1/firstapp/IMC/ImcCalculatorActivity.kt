package com.example.aplicacion1.aplicacion1.firstapp.IMC

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.example.aplicacion1.R
import com.google.android.material.slider.RangeSlider
import java.text.DecimalFormat

class ImcCalculatorActivity : AppCompatActivity() {
    private var isHomSelected: Boolean =true
    private var isMujSelected: Boolean =false
    private lateinit var hom: CardView
    private lateinit var muj: CardView
    private lateinit var  height: TextView
    private lateinit var rsHeight: RangeSlider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calculator)
        initComponents()
        initListeners()
        initUI()
    }


    private fun initComponents() {
        hom = findViewById(R.id.hom)
        muj = findViewById(R.id.muj)
        height =findViewById(R.id.height)
        rsHeight = findViewById(R.id.rsHeight)

    }
    private  fun  initListeners(){

        hom.setOnClickListener {
            changeGender()
            setGenderColor()
            changeGender()
        }

        muj.setOnClickListener {
            changeGender()
            setGenderColor()
            changeGender()
        }
        rsHeight.addOnChangeListener { _, value, _ ->
            val df = DecimalFormat("#.##")
            val result = df.format(value)
            height.text = "$result cm"
        }
    }
    private  fun changeGender(){
        isHomSelected =!isHomSelected
        isMujSelected =!isMujSelected

    }
    private  fun  setGenderColor() {


        hom.setCardBackgroundColor (getBackgroundColor(isHomSelected) )
        muj.setCardBackgroundColor(getBackgroundColor(isMujSelected))
    }

        private fun getBackgroundColor(isSelectedComponent: Boolean): Int{
            val colorReference = if(isSelectedComponent){
                R.color.background_component_selected
            } else{
                R.color.background_component
        }
             return ContextCompat.getColor(this, colorReference)
    }
    private fun initUI() {
       setGenderColor()
    }

}