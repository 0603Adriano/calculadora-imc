package com.adrianomartins.imccalc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        calcularBTN?.setOnClickListener {
            calcularIMC(alturaEDT.text.toString(), pesoEDT.text.toString())
        }
    }

    private fun calcularIMC(altura: String, peso: String) {
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()
        if (peso != null && altura != null) {
            val imc = peso / (altura * altura)
            titleTXT.text = "SEU IMC É: %.1f".format(imc)
        }
    }
}