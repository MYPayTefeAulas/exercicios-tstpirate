package com.example.atividades.greeter

import com.example.atividades.Pessoa

class Greeter2 (val cumprimento : String, val sufixo: String) {
    companion object{
        var totalGreeter2 = 0
            private set
    }

// vem antes de fun

    init {

// init  começa um bloco inicializador
        totalGreeter2++
    }

    fun greet2(pessoa: Pessoa): String{
        return "$cumprimento ${pessoa.nome}, ${pessoa.idade} $sufixo"
    }

}
