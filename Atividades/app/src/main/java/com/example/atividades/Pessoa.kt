package com.example.atividades

class Pessoa(val nome: String, val idade: Int, val telefone: String?) {
    companion object{

        var qntdPessoa = 0
        private set
    }
    init {

        qntdPessoa++

    }

    fun semNome(): Boolean{
        return nome == ""

    }

    fun semNumTelefone(): Boolean{
        return telefone == ""

    }

}
