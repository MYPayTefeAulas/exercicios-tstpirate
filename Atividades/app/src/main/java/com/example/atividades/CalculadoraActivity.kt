package com.example.atividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.atividades.databinding.ActivityCalculadoraBinding


class CalculadoraActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalculadoraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCalculadoraBinding.inflate(layoutInflater)

        binding.btTrocar.setOnClickListener {
            binding.txtHello.text = calcularComWhen()
        }

        setContentView(binding.root)
    }

    fun textoDaEntrada(): String {
        return binding.txtNumero2.text.toString()
    }

    fun multiplicar(): String {

        val numero1 = binding.txtNumero1.text.toString().toInt()
        val numero2 = binding.txtNumero2.text.toString().toInt()
        val resultado = numero1 * numero2
        return resultado.toString()
    }

    fun calcularComWhen(): String{
        val operacao = binding.txtOperacao.text.toString()
        val numero1 = binding.txtNumero1.text.toString().toInt()
        val numero2 = binding.txtNumero2.text.toString().toInt()
        var resultadoStr = ""
        when(operacao) {
            "+" -> resultadoStr = (numero1 + numero2).toString()
            "-" -> resultadoStr = (numero1 - numero2).toString()
            "*" -> resultadoStr = (numero1 * numero2).toString()
            "x" -> resultadoStr = (numero1 * numero2).toString()
            "/" -> resultadoStr = (numero1 / numero2).toString()
            ":" -> resultadoStr = (numero1 / numero2).toString()
            else -> resultadoStr = "Operação não suportada"
        }

/*        if (operacao == "+") {
            resultadoStr = (numero1 + numero2).toString()
        } else if (operacao == "-") {
            resultadoStr = (numero1 - numero2).toString()
        } else {
            resultadoStr = "Operação não suportada"
        }
*/

        return resultadoStr.toString()

    }
}