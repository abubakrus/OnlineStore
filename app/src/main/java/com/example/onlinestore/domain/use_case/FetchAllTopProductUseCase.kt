package com.example.onlinestore.domain.use_case

import com.example.onlinestore.domain.models.TopProduct
import com.example.onlinestore.domain.repositories.MainRepository

class FetchAllTopProductUseCase (
    private val repository:MainRepository
    ){
    operator fun invoke():List<TopProduct>{
        return repository.fetchAllTopProduct()
    }
}