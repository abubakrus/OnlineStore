package com.example.onlinestore.presentation.main_screen.recycler_view.top_product

import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.onlinestore.databinding.ItemRecyclerViewHorizontalBinding
import com.example.onlinestore.domain.models.TopProduct

class TopProductViewHolder(
    private val binding: ItemRecyclerViewHorizontalBinding
):RecyclerView.ViewHolder(binding.root){
    fun bind(topProduct: TopProduct) = with(binding){
        titleTopProductText.text = topProduct.title
        priseProduct.text = topProduct.price.toString()
        loadImageByUrl(imageUrl = topProduct.imageUrl, imageView = imageViewTopProduct)
    }
    private fun loadImageByUrl(imageUrl:String, imageView: ImageView){
        Glide.with(imageView.context)
            .load(imageUrl)
            .into(imageView)
    }
}