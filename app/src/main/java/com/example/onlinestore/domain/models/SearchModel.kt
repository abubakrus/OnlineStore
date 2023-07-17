package com.example.onlinestore.domain.models

data class SearchModel(
    val allCategory: AllCategory,
    val categoryEvent: CategoryEvent,
    val recommendationEvent: RecommendationEvent,
    val topProduct: TopProduct
)