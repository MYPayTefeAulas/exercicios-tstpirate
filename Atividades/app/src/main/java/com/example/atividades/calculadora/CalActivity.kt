package com.example.atividades.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.example.atividades.databinding.ActivityCalBinding

class CalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalBinding

<<<<<<< HEAD
=======
//    private val calculadora = Calculadora()
    private var equacao: TextView? = null
    private var resultado: TextView? = null
>>>>>>> main


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalBinding.inflate(layoutInflater)

<<<<<<< HEAD
        var operacao: String = ""
        var resultado: String = ""

        binding.btLimpar.setOnClickListener {
            operacao = ""
            resultado = ""
//            binding.txtOperacao.text = ""
        }

        binding.btPonto.setOnClickListener {

        }

        binding.btIgual.setOnClickListener {

        }

        binding.btPorcento.setOnClickListener {

        }

        binding.btParentese.setOnClickListener {

        }

        binding.btExpoente.setOnClickListener {

        }

        binding.btDividir.setOnClickListener {

        }

=======
>>>>>>> main
        setContentView(binding.root)
    }

}