package com.mobdeve.s14.abenoja.ameliajoyce.exercise2

import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.s14.abenoja.ameliajoyce.exercise2.databinding.ItemEpisodeLayoutBinding

class EpisodeViewHolder(private val viewBinding: ItemEpisodeLayoutBinding) : RecyclerView.ViewHolder(viewBinding.root) {
    fun bindEpisode(episode: Review) {
        viewBinding.imgEpisodeView.setImageResource(episode.episode.anime.imageId)
        viewBinding.txvAnimeTitle.text = episode.episode.anime.name
        viewBinding.txvEpisodeTitle.text = episode.episode.title
        viewBinding.txvUsername.text = episode.username
        viewBinding.txvRating.text = setRatingString(episode.rating)

    }

    private fun setRatingString(rating: Double): String {
        return "${rating.toString()}/5.0"
    }
}