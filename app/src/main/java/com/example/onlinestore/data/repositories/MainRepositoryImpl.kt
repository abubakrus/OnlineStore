package com.example.onlinestore.data.repositories

import com.example.onlinestore.data.fake_data.FakeData
import com.example.onlinestore.domain.models.TopProduct
import com.example.onlinestore.domain.repositories.MainRepository

class MainRepositoryImpl:MainRepository {
    override fun fetchAllTopProduct(
    ): List<TopProduct> {
        return FakeData.fakeTopProduct()
    }
}