package com.example.quotesapp

import android.os.Bundle
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
import com.example.quotesapp.model.quotes
import com.example.quotesapp.navigation.Navigation
import com.example.quotesapp.screens.quoteBox
import com.example.quotesapp.screens.quoteDetail
import com.example.quotesapp.screens.quoteList
import com.example.quotesapp.ui.theme.QuotesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuotesAppTheme {
                Navigation()
//                Column(
//                    horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//                    Text(
//                        text = "Quotes",
//                        style = TextStyle(
//                            fontSize = 30.sp,
//                            fontWeight = FontWeight.Bold,
//                            fontFamily = FontFamily.Cursive
//                        ),
//                        modifier = Modifier.padding(30.dp)
//                    )
//                    quoteList(quotes = quotes)
//                }
//                quoteDetail(quotes = quotes[1])
            }
        }
    }
}
