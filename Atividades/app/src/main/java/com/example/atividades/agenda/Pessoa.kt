package com.example.atividades.agenda

class Pessoa (val nome : String, val telefone: String) {
    companion object{
        var totalPessoas = 0
            private set
    }
    init {
        totalPessoas++
    }

    fun verificarNomeAgenda(): Boolean{
        return nome == ""
    }

    fun verificarTelefoneAgenda(): Boolean{
        return telefone == ""
    }

}