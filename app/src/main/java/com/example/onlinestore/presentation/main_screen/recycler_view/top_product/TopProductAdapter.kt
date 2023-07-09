package com.example.onlinestore.presentation.main_screen.recycler_view.top_product

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.onlinestore.R
import com.example.onlinestore.databinding.ItemRecyclerViewHorizontalBinding
import com.example.onlinestore.domain.models.TopProduct

class TopProductAdapter : RecyclerView.Adapter<TopProductViewHolder>() {
    private val topProduct = mutableListOf<TopProduct>()
    fun updateData(newList: List<TopProduct>) {
        topProduct.clear()
        topProduct.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopProductViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_recycler_view_horizontal, parent, false)
        val binding = ItemRecyclerViewHorizontalBinding.bind(view)
        return TopProductViewHolder(binding)
    }

    override fun getItemCount(): Int = topProduct.size

    override fun onBindViewHolder(holder: TopProductViewHolder, position: Int) {
        holder.bind(topProduct[position])
    }
}