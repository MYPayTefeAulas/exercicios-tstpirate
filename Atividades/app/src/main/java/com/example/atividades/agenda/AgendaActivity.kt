package com.example.atividades.agenda

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividades.databinding.ActivityAgendaBinding

class AgendaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAgendaBinding
    private val agenda = Agenda()
//    private var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgendaBinding.inflate(layoutInflater)

        binding.btSalvar.setOnClickListener() {
            binding.txtAviso.setText("")
            val nome = binding.txtNome.text.toString()
            val telefone = binding.txtNumero.text.toString()
            val pessoa = Pessoa (nome, telefone)

            if ( pessoa.verificarTelefoneAgenda()){
                binding.txtAviso.setTextColor(Color.rgb(216, 12, 12))
                binding.txtAviso.text = "Erro, insira nome e número de telefone"
            }else {
                if (!agenda.testeContato(pessoa)){
                    agenda.salvarContato(pessoa)
                    binding.txtAviso.setTextColor(Color.rgb(12,212,12))
                    binding.txtAviso.text = "Salvo"
                }
                else if (!pessoa.verificarTelefoneAgenda()){
                    binding.txtAviso.setTextColor(Color.rgb(216,12,12))
                    binding.txtAviso.text = "Contato repetido"
                }
            }

            binding.txtNome.setText("")
            binding.txtNumero.setText("")
        }

//        binding.btProximo.setOnClickListener {
//            agenda.salvarContato(novoContato = Pessoa(nome = String(), telefone = String()))
//            binding.txtAviso.setTextColor(Color.rgb(216,12,12))
//            binding.txtAviso.text = "Contato salvo"
//        }

        binding.btProximo.setOnClickListener {
            binding.txtAviso.setText("")
            if (agenda.retornaNumeroContato() == 0){
                binding.txtAviso.setTextColor(Color.rgb(212,12,12))
                binding.txtAviso.text = "Nenhum contato salvo"
            } else {
                binding.txtNome.setText(agenda.imprimirNomeContato())
                binding.txtNumero.setText(agenda.imprimirTelefoneContato())
            }
        }

        binding.btExcluir.setOnClickListener {
            binding.txtNome.setText("")
            binding.txtNumero.setText("")
            binding.txtAviso.setText("")
            if (agenda.retornaNumeroContato() == 0){
                binding.txtAviso.setTextColor(Color.rgb(216, 12, 12))
                binding.txtAviso.text = "Sem contatos para excluir"
            } else agenda.excluirContato()
        }

        binding.btProcurar.setOnClickListener {
            val nomeProcurar = binding.txtProcurarContato.text.toString()
            val pessoaProcurar = Pessoa(nomeProcurar,"")
            if(agenda.procurarContato(pessoaProcurar) == "false"){
                binding.txtAviso.setTextColor(Color.rgb(212, 12, 12))
                binding.txtAviso.text = "Contato inexistente"
                binding.txtNome.setText("")
                binding.txtNumero.setText("")
            } else {
                binding.txtAviso.setTextColor(Color.rgb(12, 212, 12))
                binding.txtAviso.text = "Contato encontrado"
                binding.txtNome.setText(agenda.imprimirNomePesquisa(pessoaProcurar))
                binding.txtNumero.setText(agenda.imprimirTelefonePesquisa(pessoaProcurar))
            }
        }

        setContentView(binding.root)
    }
}