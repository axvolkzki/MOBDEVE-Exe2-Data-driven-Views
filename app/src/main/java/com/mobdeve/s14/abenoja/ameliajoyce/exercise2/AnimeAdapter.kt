package com.mobdeve.s14.abenoja.ameliajoyce.exercise2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.s14.abenoja.ameliajoyce.exercise2.databinding.ItemAnimeLayoutBinding

class AnimeAdapter(private val anime: ArrayList<AnimeTitle>): RecyclerView.Adapter<AnimeViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        val viewBinding = ItemAnimeLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnimeViewHolder(viewBinding)
    }

    override fun getItemCount(): Int {
        return anime.size
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        holder.bindAnime(anime[position])
    }
}