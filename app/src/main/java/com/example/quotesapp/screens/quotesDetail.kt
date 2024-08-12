package com.example.quotesapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotesapp.model.Quotes
import com.example.quotesapp.model.quotes

@Composable
fun quoteDetail(text: String, author: String) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
            .padding(10.dp)
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color(0xFF6B6768),
                        Color(0xFFFFFFFF)
                    )
                )
            )
    ){
        Card(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()
            ) {
            Column {
                Image(
                    imageVector = Icons.Filled.Face,
                    contentDescription = null,
                    modifier = Modifier
                        .rotate(180F)
                        .size(80.dp)
                        .padding(end = 15.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = text,
                    modifier = Modifier
                        .padding(10.dp)
                        .padding(horizontal = 10.dp),
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Monospace
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = author,
                    modifier = Modifier
                        .padding(10.dp)
                        .padding(horizontal = 10.dp),
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.ExtraLight,
                        fontFamily = FontFamily.Monospace
                    )
                )
            }
        }

    }
}

@Preview
@Composable
private fun PreviewQuoteDetail() {
    quoteDetail(
        text = quotes[1].text,
        author = quotes[1].author
        )
}