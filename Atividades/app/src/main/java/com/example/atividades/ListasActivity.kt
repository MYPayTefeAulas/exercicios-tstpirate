package com.example.atividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividades.databinding.ActivityListasBinding
import com.example.atividades.databinding.ActivityMainBinding

class ListasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListasBinding

    private val listaFrutas = listOf("maçã", "mamão", "abacate")
    private val listavegetais = listOf("pepino","alface","pimentão")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListasBinding.inflate(layoutInflater)
        binding.btAnalisar.setOnClickListener {
            binding.txtSaida.text = analisar(binding.txtEntrada.text.toString())
        }
        setContentView(binding.root)
    }
    fun analisar(entrada : String): String {
        var saida = ""

        var encontrouAlimento = false


        for (fruta in listaFrutas){
            if (fruta == entrada) {
                saida = "é uma fruta"
                encontrouAlimento = true
            }
        }

        for (vegetal in listavegetais){
            if (vegetal == entrada) {
                saida = "é um vegetal"
                encontrouAlimento = true
            }
        }

        if (encontrouAlimento){
            saida = "não sei o que é isso"
        }

        return saida
    }
}