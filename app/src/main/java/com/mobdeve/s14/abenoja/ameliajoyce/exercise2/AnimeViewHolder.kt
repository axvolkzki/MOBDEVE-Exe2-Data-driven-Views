package com.mobdeve.s14.abenoja.ameliajoyce.exercise2

import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.s14.abenoja.ameliajoyce.exercise2.databinding.ItemAnimeLayoutBinding

class AnimeViewHolder(private val viewBinding: ItemAnimeLayoutBinding) : RecyclerView.ViewHolder(viewBinding.root) {
    fun bindAnime(anime: AnimeTitle) {
        viewBinding.imgAnime.setImageResource(anime.imageId)
        viewBinding.txvAnimeName.text = anime.name
    }
}