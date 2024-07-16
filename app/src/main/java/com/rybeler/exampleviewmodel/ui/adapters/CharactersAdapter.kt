package com.rybeler.exampleviewmodel.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rybeler.exampleviewmodel.data.models.Character
import com.rybeler.exampleviewmodel.data.models.asString
import com.rybeler.exampleviewmodel.databinding.CharacterLayoutBinding
import com.rybeler.exampleviewmodel.ui.fragments.SecondFragmentDirections

class CharactersAdapter(
    private val characters: List<Character>,
) : RecyclerView.Adapter<CharacterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val binding =
            CharacterLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CharacterViewHolder(binding)
    }

    override fun getItemCount(): Int = characters.size

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val characterData = characters[position]


        holder.binding.nameText.text = characterData.name
        //holder.binding.descriptionText.text =
            //characterData.description.ifEmpty { "No description" }
        val imageURL = characterData.thumbnail.asString()
            //val imageURL = "https://c8.alamy.com/comp/CPNCC5/captain-america-the-first-avenger-CPNCC5.jpg"
        Glide.with(holder.binding.root.context)
            .load(imageURL)
            .into(holder.binding.imageView)

        /*holder.binding.verMas.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToDetailsFragment("DETALLES DEL PERSONAJE")
            holder.binding.root.findNavController().navigate(action)
        }*/

    }
}
class CharacterViewHolder(val binding: CharacterLayoutBinding) : RecyclerView.ViewHolder(binding.root){

    /*private val imageView: ImageView = itemView.findViewById(R.id.image_view)
    private val nameTextView: TextView = itemView.findViewById(R.id.name_text)

    fun bind(characters: Character, onItemClick: (Character) -> Unit){
        nameTextView.text = characters.name
        Glide.with(itemView.context).load(characters.thumbnail.asString()).into(imageView)
        itemView.setOnClickListener { onItemClick(characters) }
    }*/

}

    /*override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val character = characters[position]
        holder.bind(character, onItemClick)
    }

    override fun getItemCount() = characters.size

    class CharacterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.image_view)
        private val nameTextView: TextView = itemView.findViewById(R.id.name_text)

        fun bind(character: Character, onItemClick: (Character) -> Unit) {
            nameTextView.text = character.name
            Glide.with(itemView.context).load(character.thumbnail.asString()).into(imageView)
            itemView.setOnClickListener { onItemClick(character) }
        }
    }

}*/