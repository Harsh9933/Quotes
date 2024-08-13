package com.example.quotesapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quotesapp.model.Quotes
import com.example.quotesapp.repository.QuoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class QuoteViewModel @Inject constructor(private val repository: QuoteRepository) : ViewModel() {
    val quotes : StateFlow<List<Quotes>>
        get() = repository.quote

    init {
        viewModelScope.launch {
            repository.getQuotes()
        }
    }
}