package com.example.quotesapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotesapp.api.QuoteApi
import com.example.quotesapp.model.Quotes
import com.example.quotesapp.model.quotes
import com.example.quotesapp.navigation.Navigation
import com.example.quotesapp.screens.quoteBox
import com.example.quotesapp.screens.quoteDetail
import com.example.quotesapp.screens.quoteList
import com.example.quotesapp.ui.theme.QuotesAppTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var quoteApi: QuoteApi

    @OptIn(DelicateCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        GlobalScope.launch {
            var response = quoteApi.getQuotes()
            Log.d("Harsh", response.body().toString())
        }
        enableEdgeToEdge()
        setContent {
            QuotesAppTheme {
                Navigation()
            }
        }
    }
}
