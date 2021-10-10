package com.example.atividades.rpg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividades.databinding.ActivityRpgactivityBinding

class RPGActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRpgactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRpgactivityBinding.inflate(layoutInflater)

        binding.btContinuar.setOnClickListener{
            val intent = Intent(this@RPGActivity, RPG2Activity::class.java )
            startActivity(intent)
        }

        setContentView(binding.root)
    }

}