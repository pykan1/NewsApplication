package com.example.newsapplication.di

import com.example.newsapplication.data.remote.service.NewsService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@InstallIn(SingletonComponent::class)
@Module
object ApiModule {

    @Provides
    fun provideApi(): NewsService {
        return Retrofit.Builder().baseUrl("https://newsapi.org/v2/")
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(NewsService::class.java)
    }

}