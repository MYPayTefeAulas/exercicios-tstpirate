package com.example.atividades.greeter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividades.databinding.ActivityGreeterBinding

class GreeterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGreeterBinding
    private val listaDeNomes = mutableListOf<String>()

//usar classe Pessoa em vez de String

    private var indiceAtual = 0
    private var greeterAtual = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGreeterBinding.inflate(layoutInflater)

//--------------------------------------------------------------
        //Código de configuração de variaveis:

        val greeter1 = Greeter1 ("Olá")
        val greeter2 = Greeter1("Bem vindo")

        listaDeNomes.add("Kiko")
        listaDeNomes.add("Natalina")
        listaDeNomes.add("Thalia")

//--------------------------------------------------------------
        //Configuração da tela, botões:

        binding.btImprimirProximo.setOnClickListener {
            val nomeAtual = listaDeNomes[indiceAtual]

            binding.txtSaidaImprimir.text = greeter1.greet1(nomeAtual)

            when(greeterAtual){

                1 -> binding.txtSaidaImprimir.text = greeter1.greet1(nomeAtual)
                2 -> binding.txtSaidaImprimir.text = greeter2.greet1(nomeAtual)

    /*

    ->
    separa os parâmetros e o corpo de uma expressão lambda
    separa os parâmetros e a declaração de tipo de retorno em um tipo de função
    separa a condição e o corpo de um ramo da expressão when

    */
            }

            if (indiceAtual == listaDeNomes.size -1){
                indiceAtual = 0
            } else indiceAtual++
        }

        binding.btTrocar.setOnClickListener {
            if(greeterAtual == 1){
                greeterAtual = 2
                binding.txtNumGreeter.text = "2"
            } else {
                greeterAtual = 1
                binding.txtNumGreeter.text = "1"
            }
        }

        setContentView(binding.root)

    }
}