package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.main_constraint.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_constraint)

        val btCalcular = compute_button
        val textResult = result_window

        btCalcular.setOnClickListener {
            val mass = mass_input.getText().toString().toDouble()
            val height = height_input.getText().toString().toDouble()

            if(mass == 0.0 || height == 0.0) {
                textResult.setText("Entrada invalida! Revise os valores inseridos")
            } else {
                val imc: Double = mass / (height * height)
                textResult.setText("IMC = $imc")
            }

            val result = mass / (height * height)
        }
    }
}