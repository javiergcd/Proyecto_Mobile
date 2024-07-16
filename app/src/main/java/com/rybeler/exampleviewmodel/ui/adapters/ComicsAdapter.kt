package com.rybeler.exampleviewmodel.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rybeler.exampleviewmodel.data.modelComic.ResultComic
import com.rybeler.exampleviewmodel.databinding.ComicLayoutBinding

class ComicsAdapter(
    private  val comics: List<ResultComic>,
): RecyclerView.Adapter<ComicViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComicViewHolder {
        val binding =
            ComicLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ComicViewHolder(binding)
    }

    override fun getItemCount(): Int = comics.size

    override fun onBindViewHolder(holder: ComicViewHolder, position: Int) {
        val comicData = comics[position]

        holder.binding.nameSeries.text = comicData.title
        holder.binding.descriptionSeries.text = comicData.description
            //comicData.description.ifEmpty { "No description" }
        val imageURL = "${comicData.thumbnail.path}.${comicData.thumbnail.extension}".replace("http", "https")
        Glide.with(holder.binding.root.context)
            .load(imageURL)
            .into(holder.binding.imageSeries)

    }

}

class ComicViewHolder(val binding: ComicLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)
