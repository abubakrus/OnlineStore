package com.example.onlinestore.presentation.main_screen.recycler_view.all_product

import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.onlinestore.databinding.ItemRecyclerViewVerticalBinding
import com.example.onlinestore.domain.models.AllCategory

class AllCategoryViewHolder(
    private val binding: ItemRecyclerViewVerticalBinding
):RecyclerView.ViewHolder(binding.root){
    fun bind(allCategory: AllCategory) = with(binding){
        titleProduct.text = allCategory.title
        descripitionProduct.text = allCategory.descripition
        priseProduct.text = allCategory.price.toString()
        loadImageByUrl(imageUrl = allCategory.imageUrl, imageView = imageView)
    }
    private fun loadImageByUrl(imageUrl:String, imageView: ImageView){
        Glide.with(imageView.context)
            .load(imageUrl)
            .into(imageView)
    }
}