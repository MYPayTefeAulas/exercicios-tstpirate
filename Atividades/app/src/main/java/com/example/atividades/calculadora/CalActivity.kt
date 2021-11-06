package com.example.atividades.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.atividades.databinding.ActivityCalBinding

class CalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalBinding


//    private val calculadora = Calculadora()
    private var equacao: EditText? = null
    private var resultado: TextView? = null
    private var backSpace: Button? = null
    private var limpar: Button? = null
    private var parenteses: Button? = null
    private var porcentagem: Button? = null
    private var divisao: Button? = null
    private var sete: Button? = null
    private var oito: Button? = null
    private var nove: Button? = null
    private var produto: Button? = null
    private var quatro: Button? = null
    private var cinco: Button? = null
    private var seis: Button? = null
    private var subtracao: Button? = null
    private var um: Button? = null
    private var dois: Button? = null
    private var tres: Button? = null
    private var soma: Button? = null
    private var expoente: Button? = null
    private var zero: Button? = null
    private var ponto: Button? = null
    private var igual: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalBinding.inflate(layoutInflater)


        binding.btLimpar.setOnClickListener {
//            operacao = ""
//          resultado = ""
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

        setContentView(binding.root)
    }

}