package com.rybeler.exampleviewmodel.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rybeler.exampleviewmodel.data.modelMagazine.ResultMagazine
import com.rybeler.exampleviewmodel.databinding.MagazineLayoutBinding

class MagazineAdapter (
    private val magazines: List<ResultMagazine>
): RecyclerView.Adapter<MagazineViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MagazineViewHolder {
        val binding =
            MagazineLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MagazineViewHolder(binding)
    }

    override fun getItemCount(): Int = magazines.size

    override fun onBindViewHolder(holder: MagazineViewHolder, position: Int) {
        val magazineData = magazines[position]

        holder.binding.nameMagazine.text = magazineData.title
        holder.binding.descriptionMagazine.text = magazineData.description
        //ifEmpty { "No description" }
        val imageURL = "${magazineData.thumbnail.path}.${magazineData.thumbnail.extension}".replace("http", "https")
        Glide.with(holder.binding.root.context)
            .load(imageURL)
            .into(holder.binding.imageMagazine)

        holder.binding.inicioMagazine.setText("INICIO: ${magazineData.startYear.toString()}")
        //holder.binding.inicioMagazine.text = magazineData.startYear.toString()
        //holder.binding.finMagazine.text = magazineData.endYear.toString()
        holder.binding.finMagazine.setText("FIN: ${magazineData.endYear.toString()}")

        holder.binding.tituloAutores.setText("AUTORES")
        holder.binding.listaAutores.text = magazineData.creators.items.joinToString("\n"){it.name}.ifEmpty { "No description" }



    }

}

class MagazineViewHolder(val binding: MagazineLayoutBinding):
        RecyclerView.ViewHolder(binding.root)