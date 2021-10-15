package com.example.atividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividades.agenda.AgendaActivity
import com.example.atividades.calculadora.CalActivity
import com.example.atividades.dados.SorteioDadosActivity
import com.example.atividades.databinding.ActivityHomeBinding
import com.example.atividades.greeter.GreeterActivity
import com.example.atividades.rpg.RPGActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)

        binding.btAbrirAgenda.setOnClickListener{
            val intent = Intent(this@HomeActivity, AgendaActivity::class.java )
            startActivity(intent)
        }

        binding.btAbrirCalculadora.setOnClickListener {
            val intent = Intent(this@HomeActivity, CalActivity::class.java)
            startActivity(intent)

        }

        binding.btAbrirGreeter.setOnClickListener {
            val intent = Intent(this@HomeActivity,GreeterActivity::class.java)
            startActivity(intent)
        }

        binding.btAbrirListas.setOnClickListener {
            val intent = Intent(this@HomeActivity,ListasActivity::class.java)
            startActivity(intent)

        }

        binding.btAbrirRPG.setOnClickListener {
            val intent = Intent(this@HomeActivity,RPGActivity::class.java)
            startActivity(intent)

        }

        binding.btAbrirSorteioDeDados.setOnClickListener {
            val intent = Intent(this@HomeActivity, SorteioDadosActivity::class.java)
            startActivity(intent)

        }

        setContentView(binding.root)
    }
}