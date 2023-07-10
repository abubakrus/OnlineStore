package com.example.onlinestore.presentation.main_screen.recycler_view.all_product

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.onlinestore.R
import com.example.onlinestore.databinding.ItemRecyclerViewVerticalBinding
import com.example.onlinestore.domain.models.AllCategory

class AllCategoryAdapter : RecyclerView.Adapter<AllCategoryViewHolder>() {
    private val allCategory = mutableListOf<AllCategory>()
    fun updateData(newList: List<AllCategory>) {
        allCategory.clear()
        allCategory.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllCategoryViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_recycler_view_vertical, parent, false)
        val binding = ItemRecyclerViewVerticalBinding.bind(view)
        return AllCategoryViewHolder(binding)
    }

    override fun getItemCount(): Int = allCategory.size

    override fun onBindViewHolder(holder: AllCategoryViewHolder, position: Int) {
        holder.bind(allCategory[position])
    }
}