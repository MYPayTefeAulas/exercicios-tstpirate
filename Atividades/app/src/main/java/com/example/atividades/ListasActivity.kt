package com.example.atividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividades.databinding.ActivityListasBinding

class ListasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListasBinding

    private val listaFrutas = listOf("Açaí", "Bacuri", "Pupunha")
    private val listaVerdura = listOf("Alface","Murupí","Afavaca")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListasBinding.inflate(layoutInflater)
        binding.btAnalisar.setOnClickListener {
            binding.txtSaidaImprimir.text = analisar(binding.txtEntradaListasAnalisar.text.toString())
        }
        setContentView(binding.root)
    }

    var encontrouAlimento = false

// false especifica o valor 'falso' do tipo booleano

    fun analisar(entrada : String): String {
        var saida = ""

// for começa um loop for

        for (fruta in listaFrutas){
            if (fruta == entrada) {
                saida = "é uma fruta"
                encontrouAlimento = true
                break
            }
        }

        for (verdura in listaVerdura){
            if (verdura == entrada) {
                saida = "é um vegetal"
                encontrouAlimento = true
                break
            }
        }

        if (!encontrouAlimento){
            saida = "não sei o que é isso"
        }
//!

        return saida
    }
}