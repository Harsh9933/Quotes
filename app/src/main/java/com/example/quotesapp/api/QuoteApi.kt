package com.example.quotesapp.api

import com.example.quotesapp.model.Quotes
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApi {

    @GET("/quote")
    suspend fun getQuotes() : Response<List<Quotes>>
}