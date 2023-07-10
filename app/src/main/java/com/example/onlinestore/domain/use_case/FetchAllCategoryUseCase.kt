package com.example.onlinestore.domain.use_case

import com.example.onlinestore.domain.models.AllCategory
import com.example.onlinestore.domain.repositories.MainRepository

class FetchAllCategoryUseCase(
    private val repository: MainRepository
) {
    operator fun invoke():List<AllCategory>{
        return repository.fetchAllCategoryUseCase()
    }
}