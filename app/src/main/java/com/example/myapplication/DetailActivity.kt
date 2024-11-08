package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val athleteName = intent.getStringExtra("athlete_name")
        val height = intent.getDoubleExtra("athlete_height", 0.0)
        val weight = intent.getDoubleExtra("athlete_weight", 0.0)
        val ranking = intent.getIntExtra("athlete_ranking", 0)
        val country = intent.getStringExtra("athlete_country")
        val info = intent.getStringExtra("athlete_info")


        binding.tvAthleteName.text = athleteName
        binding.tvHeight.text = "Height: $height m"
        binding.tvWeight.text = "Weight: $weight kg"
        binding.tvRanking.text = "Ranking: $ranking"
        binding.tvCountry.text = "Country: $country"
        binding.tvInfo.text = info
    }
}