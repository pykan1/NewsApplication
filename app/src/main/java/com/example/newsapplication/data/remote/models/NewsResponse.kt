package com.example.newsapplication.data.remote.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
class NewsResponse(
    @SerialName("status")
    val statusResponse: String?,
    val totalResults: Int?,
    val articles: List<NewResponse>?
)


@Serializable
class NewResponse (
    val author: String?,
    val title: String?,
    val description: String?,
    val url: String?,
    val urlToImage: String?,
    val publishedAt: String?,
    val content: String?
)