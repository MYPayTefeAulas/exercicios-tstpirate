package com.example.atividades.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividades.databinding.ActivityCalBinding

class CalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCalBinding.inflate(layoutInflater)

//Limpar tudo

        binding.btLimpar.setOnClickListener {

        }

//Parenteses

        binding.btParentese1.setOnClickListener {

        }

        binding.btParenteses2.setOnClickListener {

        }

//Operações

        binding.btDividir.setOnClickListener {

        }

        binding.btExpoente.setOnClickListener {

        }

        binding.btIgual.setOnClickListener {

        }

        binding.btMultiplicar.setOnClickListener {

        }

        binding.btSomar.setOnClickListener {

        }

        binding.btSubtrair.setOnClickListener {

        }

//Ponto/Vírgula

        binding.btPonto.setOnClickListener {

        }

// Números

        binding.btUm.setOnClickListener {
//            binding.txtEquacao.text = binding.txtEquacao.text.toString() + "1"
//            if (operacao == "+" || )

        }

        binding.btDois.setOnClickListener {

        }

        binding.btTres.setOnClickListener {

        }

        binding.btQuatro.setOnClickListener {

        }

        binding.btCinco.setOnClickListener {

        }

        binding.btSeis.setOnClickListener {

        }

        binding.btSete.setOnClickListener {

        }

        binding.btOito.setOnClickListener {

        }

        binding.btNove.setOnClickListener {

        }

        binding.btZero.setOnClickListener {

        }

//Histórico
        binding.btHistorico.setOnClickListener {

        }

//Backspace
        binding.btBackspace.setOnClickListener {

        }

        setContentView(binding.root)
    }
}