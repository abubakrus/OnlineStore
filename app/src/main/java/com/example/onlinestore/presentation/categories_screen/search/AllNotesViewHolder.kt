package com.example.onlinestore.presentation.categories_screen.search

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.onlinestore.databinding.ItemRecyclerViewCategoriesBinding
import com.example.onlinestore.domain.models.CategoryEvent

class AllNotesViewHolder(
    private val binding: ItemRecyclerViewCategoriesBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(category: CategoryEvent) = with(binding) {
        title.text = category.title
        Glide.with(root.context)
            .load(category.imageUrl)
            .into(imageView)

    }

}