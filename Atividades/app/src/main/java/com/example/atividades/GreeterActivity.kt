package com.example.atividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividades.databinding.ActivityGreeterBinding

class GreeterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGreeterBinding
    private val listaDeNomes = mutableListOf<String>()
    private var indiceAtual = 0
    private lateinit var greeterAtual: GreeterTipo1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGreeterBinding.inflate(layoutInflater)

//--------------------------------------------------------------
        //Código de configuração de variaveis:
        val greeter1 = GreeterTipo1 ("Olá")
        val greeter2 = GreeterTipo1("Bem vindo")
        greeterAtual = greeter1
        listaDeNomes.add("Kiko")
        listaDeNomes.add("Natalina")
        listaDeNomes.add("Thalia")

//--------------------------------------------------------------
        //Configuração da tela, botoes:

        binding.btImprimir.setOnClickListener {
            val nomeAtual = listaDeNomes[indiceAtual]

            binding.txtSaida.text = greeterAtual.greet(nomeAtual)

            if (indiceAtual == listaDeNomes.size -1) {
                indiceAtual = 0
            } else {
                indiceAtual++
            }
        }

        binding.btTrocar.setOnClickListener {
            if(greeterAtual == greeter1){
                greeterAtual = greeter2
                binding.txtNumGreeter.text = "2"
            } else {
                greeterAtual = greeter1
                binding.txtNumGreeter.text = "1"
            }
        }

        setContentView(binding.root)
    }
}