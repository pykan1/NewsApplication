package com.example.newsapplication.data.remote.service

import com.example.newsapplication.data.remote.models.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {

    @GET("everything")
    suspend fun getNews(
        @Query("q") queryText: String = "i",
        @Query("from") fromDate: String = "",
        @Query("sortBy") sortBy: String = "",
        @Query("apiKey") apiKey: String = "6a5383bad9334ac69bb4dd9b8fd45bf8"
        ): NewsResponse

}