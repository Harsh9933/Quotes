package com.example.quotesapp.di

import com.example.quotesapp.api.QuoteApi
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {
    fun providesRetrofit(): Retrofit{
        return Retrofit.Builder().baseUrl("http://localhost:8080")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun providesQuoteApi(retrofit: Retrofit) : QuoteApi{
        return retrofit.create(QuoteApi::class.java)
    }
}