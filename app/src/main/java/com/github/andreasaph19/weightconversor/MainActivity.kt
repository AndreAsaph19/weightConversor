package com.github.andreasaph19.weightconversor


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.andreasaph19.weightconversor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calcular.setOnClickListener{ calcular() }
    }

    fun calcular() {
        val stringInTextField = binding.valor.text.toString()
        var valor = stringInTextField.toDouble()
        val selectedId = binding.radio.checkedRadioButtonId
        if (selectedId == R.id.kg_lbs) {
            valor = valor * 2.2
            var resultadoString = String.format("Resultado:", valor)
            binding.resultado.text = resultadoString
        } else {
            valor = valor * 0.45
            var resultado = String.format("Resultado:", valor)
            binding.resultado.text = resultado
        }

    }

}