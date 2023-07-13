package com.example.onlinestore.domain.use_case

import com.example.onlinestore.domain.models.AllCategory
import com.example.onlinestore.domain.models.CategoryEvent
import com.example.onlinestore.domain.repositories.MainRepository

class FetchAllCategoriesEventUseCase(
    private val repository: MainRepository
) {
    operator fun invoke(): List<CategoryEvent> {
        return repository.fetchAllCategoriesEventUseCase()
    }
}