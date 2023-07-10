package com.example.onlinestore.presentation.main_screen.view_pager

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.onlinestore.R
import com.example.onlinestore.databinding.ItemRecommendationEventBinding
import com.example.onlinestore.databinding.ItemRecyclerViewHorizontalBinding
import com.example.onlinestore.domain.models.RecommendationEvent
import com.example.onlinestore.domain.models.TopProduct

class ViewPagerAdapter : RecyclerView.Adapter<ViewPagerViewHolder>() {
    private val event = mutableListOf<RecommendationEvent>()
    fun updateData(newList: List<RecommendationEvent>) {
        event.clear()
        event.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_recommendation_event, parent, false)
        val binding = ItemRecommendationEventBinding.bind(view)
        return ViewPagerViewHolder(binding)
    }

    override fun getItemCount(): Int = event.size

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        holder.bind(event[position])
    }
}