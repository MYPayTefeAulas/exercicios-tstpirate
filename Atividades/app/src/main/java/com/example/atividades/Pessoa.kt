package com.example.atividades

class Pessoa(val nome: String, val idade: Int, val telefone: String?) {
    companion object{

// companion declara um objeto companheiro

        var qntdPessoa = 0
        private set
    }
    init {
// init começa um bloco inicializador

        qntdPessoa++

// ++ , -- , - operadores de incremento e decremento

    }

    fun semNome(): Boolean{
        return nome == ""

    }

    fun semNumTelefone(): Boolean{
        return telefone == ""

    }

}
