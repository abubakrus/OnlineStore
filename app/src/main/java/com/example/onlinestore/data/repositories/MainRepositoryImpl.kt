package com.example.onlinestore.data.repositories

import com.example.onlinestore.data.fake_data.FakeData
import com.example.onlinestore.domain.models.AllCategory
import com.example.onlinestore.domain.models.RecommendationEvent
import com.example.onlinestore.domain.models.TopProduct
import com.example.onlinestore.domain.repositories.MainRepository

class MainRepositoryImpl:MainRepository {
    override fun fetchAllTopProduct(
    ): List<TopProduct> {
        return FakeData.fakeTopProduct()
    }

    override fun fetchAllCategoryUseCase(
    ): List<AllCategory> {
        return FakeData.fakeAllCategory()
    }

    override fun fetchAllRecommendationEventUseCase(
    ): List<RecommendationEvent> {
        return FakeData.fakeRecommendationEvent()
    }
}