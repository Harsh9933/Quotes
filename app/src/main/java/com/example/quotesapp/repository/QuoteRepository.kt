package com.example.quotesapp.repository

import com.example.quotesapp.api.QuoteApi
import com.example.quotesapp.model.Quotes
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class QuoteRepository @Inject constructor(private val quoteApi: QuoteApi){

    private val _quotes = MutableStateFlow<List<Quotes>>(emptyList())
    val quote : StateFlow<List<Quotes>>
        get() = _quotes


    suspend fun getQuotes(){
        val result = quoteApi.getQuotes()
        if (result.isSuccessful && result.body() != null){
           _quotes.emit(result.body()!!)
        }
    }
}