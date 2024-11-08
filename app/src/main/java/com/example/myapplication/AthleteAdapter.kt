package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemAthleteBinding

class AthleteAdapter(
    private val athletes: List<Athlete>,
    private val onItemClicked: (Athlete) -> Unit
) : RecyclerView.Adapter<AthleteAdapter.AthleteViewHolder>() {

    inner class AthleteViewHolder(private val binding: ItemAthleteBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(athlete: Athlete) {
            binding.tvAthleteName.text = athlete.name
            binding.tvRanking.text = "Ranking: ${athlete.ranking}"
            binding.tvCountry.text = "Country: ${athlete.country}"
            binding.root.setOnClickListener { onItemClicked(athlete) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AthleteViewHolder {
        val binding = ItemAthleteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AthleteViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AthleteViewHolder, position: Int) {
        holder.bind(athletes[position])
    }

    override fun getItemCount() = athletes.size
}
