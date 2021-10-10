package com.example.atividades.greeter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividades.Pessoa
import com.example.atividades.databinding.ActivityGreeter2Binding

class GreeterActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityGreeter2Binding
    private var listaPessoas = mutableListOf<Pessoa>()
    private var listaGreete = mutableListOf<Greeter2>()
    private var idade = 0
    private var nome = ""
    private var indiceAtual = 0
    private var greeterAtual = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityGreeter2Binding.inflate(layoutInflater)

        val greeter2 = Greeter2("Olá", "!")
        val greeter3 = Greeter2("Bem Vindo", "!")

        binding.btImprimirProximo.setOnClickListener(){
            val pessoa1 = listaPessoas[indiceAtual]

            when(greeterAtual){
                1 -> binding.txtAviso.text = greeter2.greet2(pessoa1)
                2 -> binding.txtAviso.text = greeter3.greet2(pessoa1)
            }
            if (indiceAtual == listaPessoas.size -1){
                indiceAtual = 0
            } else indiceAtual++


        }

        binding.btSalvar.setOnClickListener {
//            var nome = binding.txtNome.text.toString()
//            var idade = binding.txtIdade.text.toString()
//            val pessoa = Pessoa(nome, idade, telefone = null)

//            return binding.txtSaida.text.toString()

        }

        binding.btTrocar.setOnClickListener {

            if (greeterAtual == 1){
                greeterAtual = 2
                binding.txtNumGreeter2.text = "2"
            } else {
                greeterAtual = 1
                binding.txtNumGreeter2.text = "1"
            }
        }

        setContentView(binding.root)
    }

}