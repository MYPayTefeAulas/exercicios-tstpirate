package com.example.atividades.agenda

class Agenda {
    private val listaContatos = mutableListOf<Pessoa>()
    private var indiceAtual = 0

    fun testeContato(contato: Pessoa): Boolean {
        var encontrou = false
        for (lista in listaContatos){
            if ((lista.nome == contato.nome) && (lista.telefone == contato.telefone)){
                encontrou = true
                break
            }
        }
        return encontrou
    }

    fun salvarContato (novoContato: Pessoa){
        listaContatos.add(novoContato)
    }

    fun imprimirNomeContato(): String {
        if (indiceAtual == listaContatos.size)
            indiceAtual = 0
        val contatoAtual = listaContatos[indiceAtual]
        indiceAtual++
        return "${contatoAtual.nome}"
    }
    fun imprimirTelefoneContato(): String{
        indiceAtual -= 1
        if(indiceAtual == listaContatos.size)
            indiceAtual = 0
        val contatoAtual = listaContatos[indiceAtual]
        indiceAtual++
        return "${contatoAtual.telefone}"
    }
    fun excluirContato(){
        if (indiceAtual >= 1){
            indiceAtual -= 1
            val contatoAtual = listaContatos[indiceAtual]
            listaContatos.remove(contatoAtual)
        } else {
            val contatoAtual = listaContatos[indiceAtual]
            listaContatos.remove(contatoAtual)
        }
    }

    fun removeNumeroContato():Int{
        return listaContatos.size
    }

    fun retornaNumeroContato(): Int {
        return listaContatos.size
    }
    fun procurarContato(contato: Pessoa): String{
        var encontrou = "false"
        for (lista in listaContatos){
            if (lista.nome == contato.nome){
                encontrou = lista.nome
                break
            }
        }
        return encontrou
    }
    fun imprimirNomePesquisa(contato: Pessoa): String{
        var encontrou = ""
        for (lista in listaContatos){
            if (lista.nome == contato.nome){
                encontrou == lista.nome
                break
            }
        }
        return encontrou
    }
    fun imprimirTelefonePesquisa(contato: Pessoa): String{
        var encontrou : String = ""
        for (lista in listaContatos){
            if (lista.nome == contato.nome){
                encontrou == lista.telefone.toString()
                break
            }
        }
        return encontrou
    }
}