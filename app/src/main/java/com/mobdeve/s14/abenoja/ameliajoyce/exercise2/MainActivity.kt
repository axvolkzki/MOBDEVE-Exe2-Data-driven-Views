package com.mobdeve.s14.abenoja.ameliajoyce.exercise2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.SnapHelper
import com.mobdeve.s14.abenoja.ameliajoyce.exercise2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        // View Binding Components
        val linearLayoutHorizontal = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val linearLayoutVertical = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        // Anime List
        viewBinding.rcvAnimeList.adapter = AnimeAdapter(DataGenerator.generateAnimeTitleData())
        viewBinding.rcvAnimeList.layoutManager = linearLayoutHorizontal

        // Snap Helper
        val snapHelper: SnapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(viewBinding.rcvAnimeList)


        // Episode List
        viewBinding.rcvEpisodeList.adapter = EpisodeAdapter(DataGenerator.generateRecentReviewsData())
        viewBinding.rcvEpisodeList.layoutManager = linearLayoutVertical
    }
}