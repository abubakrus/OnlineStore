package com.example.onlinestore.presentation.categories_screen.recycler_view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.onlinestore.R
import com.example.onlinestore.databinding.ItemRecyclerViewCategoriesBinding
import com.example.onlinestore.databinding.ItemRecyclerViewVerticalBinding
import com.example.onlinestore.domain.models.AllCategory
import com.example.onlinestore.domain.models.CategoryEvent

class CategoryEventAdapter : RecyclerView.Adapter<CategoryEventViewHolder>() {
    private val categoryEvent = mutableListOf<CategoryEvent>()
    fun updateData(newList: List<CategoryEvent>) {
        categoryEvent.clear()
        categoryEvent.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryEventViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.include_categories_content, parent, false)
        val binding = ItemRecyclerViewCategoriesBinding.bind(view)
        return CategoryEventViewHolder(binding)
    }

    override fun getItemCount(): Int = categoryEvent.size

    override fun onBindViewHolder(holder: CategoryEventViewHolder, position: Int) {
        holder.bind(categoryEvent[position])
    }
}