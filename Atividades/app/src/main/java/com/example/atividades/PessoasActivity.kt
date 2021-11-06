package com.example.atividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividades.databinding.ActivityPessoasBinding

class PessoasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPessoasBinding

    private var nome = ""
    private var idade = 0

    private val listaPessoas = mutableListOf<Pessoa>()
    private var indiceAtual = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPessoasBinding.inflate(layoutInflater)

        binding.btImprimirProximo.setOnClickListener {
            binding.txtSaidaImprimir.text = imprimePessoa()
        }

        binding.btSalvar.setOnClickListener {
            nome = binding.txtNome.text.toString()
            binding.txtNome.text.clear()
            idade = binding.txtIdade.toString().toInt()
            binding.txtIdade.text.clear()

            val pessoa = Pessoa(nome, idade, telefone = null)

            listaPessoas.add(pessoa)
        }

        setContentView(binding.root)
    }

    fun imprimePessoa(): String {


        if (indiceAtual >= listaPessoas.size)
            indiceAtual = 0

        val pessoaAtual = listaPessoas[indiceAtual]
        indiceAtual++
        return "nome: ${pessoaAtual.nome}, idade: ${pessoaAtual.idade}"
    }
}