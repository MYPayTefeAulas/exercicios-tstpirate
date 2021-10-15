package com.example.atividades.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.example.atividades.databinding.ActivityCalBinding

class CalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalBinding

//    private val calculadora = Calculadora()
    private var equacao: TextView? = null
    private var resultado: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }

}