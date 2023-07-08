package com.example.onlinestore.domain.models

import android.icu.text.CaseMap.Title

data class AllCategory(
    val id: String,
    val title: String,
    val descripition: String,
    val prise: Int,
    val imageUrl: String,
)
