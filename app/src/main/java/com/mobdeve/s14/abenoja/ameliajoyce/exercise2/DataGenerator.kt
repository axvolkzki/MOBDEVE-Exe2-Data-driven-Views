package com.mobdeve.s14.abenoja.ameliajoyce.exercise2

import com.mobdeve.s14.abenoja.ameliajoyce.exercise2.AnimeTitle
import com.mobdeve.s14.abenoja.ameliajoyce.exercise2.Episode
import com.mobdeve.s14.abenoja.ameliajoyce.exercise2.R



class DataGenerator {
    companion object {
        private val anime1 : AnimeTitle = AnimeTitle(R.drawable.anime1, "The Rising of the Shield Hero Season 3")
        private val anime2 : AnimeTitle = AnimeTitle(R.drawable.anime2, "Goblin Slayer II")
        private val anime3 : AnimeTitle = AnimeTitle(R.drawable.anime3, "Spy x Family Season 2")
        private val anime4 : AnimeTitle = AnimeTitle(R.drawable.anime4, "The Eminence in Shadow Season 2")
        private val anime5 : AnimeTitle = AnimeTitle(R.drawable.anime5, "Dr. Stone: New World Part 2")
        private val anime6 : AnimeTitle = AnimeTitle(R.drawable.anime6, "Frieren: Beyond Journey's End")
        private val anime7 : AnimeTitle = AnimeTitle(R.drawable.anime7, "Tokyo Revengers: Tenjiku-hen")
        private val anime8 : AnimeTitle = AnimeTitle(R.drawable.anime8, "Keikenzumi na Kimi to, Keiken Zero na Ore ga, Otsukiai suru Hanashi.")
        private val anime9 : AnimeTitle = AnimeTitle(R.drawable.anime9, "The Faraway Paladin: The Lord of Rust Mountains")
        private val anime10 : AnimeTitle = AnimeTitle(R.drawable.anime10, "The Apothecary Diaries")
        private val anime11 : AnimeTitle = AnimeTitle(R.drawable.anime11, "Undead Unluck")

        private val episodeA = Episode("Episode 1", anime6)
        private val episodeB = Episode("Episode 2", anime6)
        private val episodeC = Episode("Episode 3", anime6)
        private val episodeD = Episode("Episode 1", anime4)
        private val episodeE = Episode("Episode 1", anime8)
        private val episodeF = Episode("Episode 1", anime3)
        private val episodeG = Episode("Episode 2", anime10)
        private val episodeH = Episode("Episode 4", anime11)

        fun generateAnimeTitleData(): ArrayList<AnimeTitle> {
            return arrayListOf<AnimeTitle>(anime1, anime2, anime3, anime4, anime5, anime6, anime7, anime8, anime9, anime10, anime11)
        }

        fun generateRecentReviewsData(): ArrayList<Review> {
            var tempList = ArrayList<Review>()

            tempList.add(Review("Dio", 4.5, episodeA))
            tempList.add(Review("Dio", 4.5, episodeD))
            tempList.add(Review("Dio", 1.5, episodeE))
            tempList.add(Review("Dio", 3.5, episodeF))

            tempList.add(Review("Eren", 1.5, episodeB))
            tempList.add(Review("Eren", 5.0, episodeC))
            tempList.add(Review("Eren", 5.0, episodeD))
            tempList.add(Review("Eren", 1.5, episodeF))

            tempList.add(Review("Griffith", 5.0, episodeA))
            tempList.add(Review("Griffith", 5.0, episodeC))
            tempList.add(Review("Griffith", 0.5, episodeD))
            tempList.add(Review("Griffith", 3.5, episodeE))

            tempList.add(Review("Madara Uchiha", 2.5, episodeA))
            tempList.add(Review("Madara Uchiha", 1.5, episodeG))
            tempList.add(Review("Madara Uchiha", 3.0, episodeH))

            tempList.add(Review("Meruem", 4.0, episodeD))
            tempList.add(Review("Meruem", 3.0, episodeE))
            tempList.add(Review("Meruem", 4.5, episodeC))

            tempList.add(Review("Hisoka", 4.5, episodeF))
            tempList.add(Review("Hisoka", 0.5, episodeB))

            tempList.add(Review("Pain", 3.5, episodeH))
            tempList.add(Review("Pain", 3.5, episodeG))
            tempList.add(Review("Pain", 3.5, episodeF))

            return tempList.shuffled() as ArrayList<Review>
        }
    }
}