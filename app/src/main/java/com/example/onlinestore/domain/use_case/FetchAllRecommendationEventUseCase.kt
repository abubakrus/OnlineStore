package com.example.onlinestore.domain.use_case

import com.example.onlinestore.domain.models.RecommendationEvent
import com.example.onlinestore.domain.models.TopProduct
import com.example.onlinestore.domain.repositories.MainRepository

class FetchAllRecommendationEventUseCase (
    private val repository:MainRepository
    ){
    operator fun invoke():List<RecommendationEvent>{
        return repository.fetchAllRecommendationEventUseCase()
    }
}