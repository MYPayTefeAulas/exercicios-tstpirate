package com.example.atividades.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividades.databinding.ActivitySorteioDadosBinding

class SorteioDadosActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySorteioDadosBinding
    private val dado1 = Dados(4)
    private val dado2 = Dados(6)
    private val dado3 = Dados(8)
    private val dado4 = Dados(10)
    private var listaDados = mutableListOf<Dados>()
    var posicao1 = 0
    var posicao2 = 0
    var posicao3 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySorteioDadosBinding.inflate(layoutInflater)

        listaDados.add(dado1)
        listaDados.add(dado2)
        listaDados.add(dado3)
        listaDados.add(dado4)

        binding.btSortear.setOnClickListener {
            binding.txtNumLados1.text = listaDados[posicao1].lancar()
            binding.txtNumLados2.text = listaDados[posicao2].lancar()
            binding.txtNumLados3.text = listaDados[posicao3].lancar()
            binding.txtQntdLados1.text = "${listaDados[posicao1].numLados}"
            binding.txtQntdLados2.text = "${listaDados[posicao2].numLados}"
            binding.txtQntdLados3.text = "${listaDados[posicao3].numLados}"

        }

        binding.btTrocar1.setOnClickListener {
            posicao1++

            if (posicao1 == listaDados.size){
                posicao1 = 0
            }
            binding.txtQntdLados1.text = "${listaDados[posicao1].numLados}"

        }

        binding.btTrocar2.setOnClickListener {
            posicao2++

            if (posicao2 == listaDados.size){
                posicao2 = 0
            }
            binding.txtQntdLados2.text = "${listaDados[posicao2].numLados}"

        }

        binding.btTrocar3.setOnClickListener {
            posicao3++

            if (posicao3 == listaDados.size){
                posicao3 = 0
            }
            binding.txtQntdLados3.text = "${listaDados[posicao3].numLados}"

        }

        setContentView(binding.root)
    }
}
