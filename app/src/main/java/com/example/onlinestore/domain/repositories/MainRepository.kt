package com.example.onlinestore.domain.repositories

import com.example.onlinestore.domain.models.AllCategory
import com.example.onlinestore.domain.models.TopProduct

interface MainRepository {
    fun fetchAllTopProduct(): List<TopProduct>
    fun fetchAllCategoryUseCase(): List<AllCategory>
}