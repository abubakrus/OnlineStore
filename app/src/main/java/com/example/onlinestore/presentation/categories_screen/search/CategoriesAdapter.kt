package com.example.onlinestore.presentation.categories_screen.search

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.onlinestore.R
import com.example.onlinestore.databinding.ItemRecyclerViewCategoriesBinding
import com.example.onlinestore.domain.models.CategoryEvent

class CategoriesAdapter() : RecyclerView.Adapter<AllNotesViewHolder>(), Parcelable {

    private val category = mutableListOf<CategoryEvent>()

    constructor(parcel: Parcel) : this() {
    }

    fun updateList(newList: List<CategoryEvent>) {
        category.clear()
        category.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllNotesViewHolder {
        val view = LayoutInflater
            .from(parent.context).inflate(R.layout.item_recycler_view_categories, parent, false)
        val binding = ItemRecyclerViewCategoriesBinding.bind(view)
        return AllNotesViewHolder(binding)
    }
    override fun getItemCount(): Int = category.size


    override fun onBindViewHolder(holder: AllNotesViewHolder, position: Int) {
        holder.bind(category[position])
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CategoriesAdapter> {
        override fun createFromParcel(parcel: Parcel): CategoriesAdapter {
            return CategoriesAdapter(parcel)
        }

        override fun newArray(size: Int): Array<CategoriesAdapter?> {
            return arrayOfNulls(size)
        }
    }


}