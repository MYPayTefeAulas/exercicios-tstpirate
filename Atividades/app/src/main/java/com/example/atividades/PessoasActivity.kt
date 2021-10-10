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

// null  é uma constante que representa uma referência de objeto que não aponta para nenhum objeto

            listaPessoas.add(pessoa)
        }

        setContentView(binding.root)
    }

    fun imprimePessoa(): String {

// caso finalise a lista, mostrar "FIM"
// novo botão : Do começo

        if (indiceAtual >= listaPessoas.size)
            indiceAtual = 0

//>= operador de comparação

        val pessoaAtual = listaPessoas[indiceAtual]
        indiceAtual++
        return "nome: ${pessoaAtual.nome}, idade: ${pessoaAtual.idade}"
    }
}