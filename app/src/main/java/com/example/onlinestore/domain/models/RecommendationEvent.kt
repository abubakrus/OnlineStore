package com.example.onlinestore.domain.models

import android.icu.text.CaseMap.Title
import java.util.IdentityHashMap
import java.util.TimeZone

data class RecommendationEvent(
    val id: String,
    val title: String,
    val imageUrl: String,
)
