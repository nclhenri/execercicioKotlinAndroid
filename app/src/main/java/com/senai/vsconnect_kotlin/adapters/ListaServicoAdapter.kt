package com.senai.vsconnect_kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.senai.vsconnect_kotlin.models.Servico

class ListaServicoAdapter(
    private val context: Context,
    private val listaServicos: List<Servico>
)  : RecyclerView.Adapter<ListaServicoAdapter.ViewHolder>(){

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun vincularDadosNoItem(servico: Servico) {
            val tituloServico = itemView.findViewById<TextView>(R.id.nomeServico)
            tituloServico.text = servico.titulo

            val proposta = itemView.findViewById<TextView>(R.id.valorSerivco)
            proposta.text = servico.proposta

            val descricaoServico = itemView.findViewById<TextView>(R.id.descricaoServico)
            descricaoServico.text = servico.descricao
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaServicoAdapter.ViewHolder {
        val inflater = LayoutInflater.from(context)

        val view = inflater.inflate(R.layout.fragment_servico, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListaServicoAdapter.ViewHolder, position: Int) {
        val itemServico = listaServicos[position]

        holder.vincularDadosNoItem(itemServico)
    }

    override fun getItemCount(): Int {
        return listaServicos.size
    }
}