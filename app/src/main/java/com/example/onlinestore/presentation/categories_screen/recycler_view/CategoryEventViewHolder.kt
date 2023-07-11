package com.example.onlinestore.presentation.categories_screen.recycler_view

import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.onlinestore.databinding.ItemRecyclerViewCategoriesBinding
import com.example.onlinestore.domain.models.AllCategory
import com.example.onlinestore.domain.models.CategoryEvent

class CategoryEventViewHolder(
    private val binding: ItemRecyclerViewCategoriesBinding
):RecyclerView.ViewHolder(binding.root){
    fun bind(categoryEvent: CategoryEvent) = with(binding){
        title.text = categoryEvent.title
        loadImageByUrl(imageUrl = categoryEvent.imageUrl, imageView = imageView)
    }
    private fun loadImageByUrl(imageUrl:String, imageView: ImageView){
        Glide.with(imageView.context)
            .load(imageUrl)
            .into(imageView)
    }
}