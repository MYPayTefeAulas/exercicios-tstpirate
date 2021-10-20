package com.example.atividades.dados

class Dados (val numLados : Int){

    private var qntdLados = mutableListOf<Int>()
    private var i = 1

    fun lancar(): String{
        while (i <= numLados){
            qntdLados.add(i)
            i++
        }
        return "${qntdLados.shuffled().first()}"
        }

    }