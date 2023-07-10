package com.example.onlinestore.presentation.main_screen.view_pager

import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.onlinestore.databinding.ItemRecommendationEventBinding
import com.example.onlinestore.databinding.ItemRecyclerViewHorizontalBinding
import com.example.onlinestore.domain.models.RecommendationEvent
import com.example.onlinestore.domain.models.TopProduct

class ViewPagerViewHolder(
    private val binding: ItemRecommendationEventBinding
):RecyclerView.ViewHolder(binding.root){
    fun bind(event: RecommendationEvent) = with(binding){

        loadImageByUrl(imageUrl = event.imageUrl, imageView = imageView)
    }
    private fun loadImageByUrl(imageUrl:String, imageView: ImageView){
        Glide.with(imageView.context)
            .load(imageUrl)
            .into(imageView)
    }
}