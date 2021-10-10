package com.example.atividades.rpg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividades.databinding.ActivityRpg2Binding

class RPG2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityRpg2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRpg2Binding.inflate(layoutInflater)



        setContentView(binding.root)
    }
}