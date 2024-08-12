package com.example.quotesapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.quotesapp.model.Quotes
import com.example.quotesapp.model.quotes


@Composable
fun quoteList(
    quotes: List<Quotes>,
    navController: NavController
    ) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background(
            Brush.sweepGradient(
                colors = listOf(
                    Color(0xFF6B6768),
                    Color(0xFFFFFFFF)
                )
            )
        )
    ){

        Text(
            text = "Quotes",
            style = TextStyle(
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive
            ),
            modifier = Modifier.padding(30.dp)
                .clip(RoundedCornerShape(30.dp))
        )

        LazyColumn {
            items(quotes){ quote ->
                quoteBox(text = quote.text, author = quote.author , navController=navController)
                Spacer(modifier = Modifier.height(10.dp))

            }
        }

    }


}

@Preview
@Composable
private fun PreviewQuoteList() {
    quoteList(quotes = quotes, navController = rememberNavController() )
}