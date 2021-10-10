package com.example.atividades.rpg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividades.databinding.ActivityRpg3Binding

class RPG3Activity : AppCompatActivity() {
    private lateinit var binding: ActivityRpg3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRpg3Binding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}