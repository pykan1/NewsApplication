package com.example.newsapplication.domain.models

import kotlinx.serialization.Serializable


data class NewUI (
    val author: String,
    val title: String,
    val description: String,
    val url: String?,
    val urlToImage: String,
    val publishedAt: String,
    val content: String
)