package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val athletes = listOf(
            Athlete("Conor McGregor", 1.75, 70.0, 1, "Ireland", "Conor McGregor is known for his striking ability and charismatic personality. He has won titles in two different weight classes."),
            Athlete("Khabib Nurmagomedov", 1.78, 70.3, 2, "Russia", "Khabib is known for his exceptional grappling skills and undefeated record in MMA."),
            Athlete("Israel Adesanya", 1.93, 84.0, 3, "Nigeria", "Israel Adesanya is a dynamic striker and former UFC Middleweight Champion."),
            Athlete("Jon Jones", 1.93, 93.0, 4, "USA", "Jon Jones is considered one of the greatest fighters of all time, known for his versatile fighting skills and dominance in the light heavyweight division."),
            Athlete("Francis Ngannou", 1.93, 119.0, 5, "Cameroon", "Francis Ngannou is renowned for his powerful punches and holds the record for the hardest punch recorded in the UFC."),
            Athlete("Stipe Miocic", 1.93, 111.0, 6, "USA", "Stipe Miocic is a former UFC Heavyweight Champion and is known for his well-rounded fighting style."),
            Athlete("Max Holloway", 1.80, 66.0, 7, "USA", "Max Holloway is a former UFC Featherweight Champion, known for his volume striking and endurance."),
            Athlete("Dustin Poirier", 1.75, 70.0, 8, "USA", "Dustin Poirier is a former interim lightweight champion, known for his resilience and boxing skills."),
            Athlete("Amanda Nunes", 1.73, 61.0, 9, "Brazil", "Amanda Nunes is a two-division champion and widely regarded as one of the greatest female fighters in MMA."),
            Athlete("Jorge Masvidal", 1.80, 77.0, 10, "USA", "Jorge Masvidal is known for his striking and high-profile fights, including the fastest knockout in UFC history.")
        )


        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = AthleteAdapter(athletes) { athlete ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("athlete_name", athlete.name)
            intent.putExtra("athlete_height", athlete.height)
            intent.putExtra("athlete_weight", athlete.weight)
            intent.putExtra("athlete_ranking", athlete.ranking)
            intent.putExtra("athlete_country", athlete.country)
            intent.putExtra("athlete_info", athlete.info)
            startActivity(intent)
        }
    }
}