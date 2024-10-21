package com.mobdeve.s14.abenoja.ameliajoyce.exercise2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.s14.abenoja.ameliajoyce.exercise2.databinding.ItemEpisodeLayoutBinding

class EpisodeAdapter(private val episode: ArrayList<Review>): RecyclerView.Adapter<EpisodeViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EpisodeViewHolder {
        val viewBinding = ItemEpisodeLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EpisodeViewHolder(viewBinding)
    }

    override fun getItemCount(): Int {
        return episode.size
    }

    override fun onBindViewHolder(holder: EpisodeViewHolder, position: Int) {
        holder.bindEpisode(episode[position])
    }
}