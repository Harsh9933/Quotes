package com.example.quotesapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.quotesapp.navigation.Screen

@Composable
fun quoteBox(
    text : String,
    author : String,
    navController: NavController
) {
    Card(
        onClick = { navController.navigate(Screen.DetailScreen.withArgs(text,author)) },
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .padding(10.dp)
        ) {
            Image(
                imageVector = Icons.Filled.Face ,
                contentDescription = null,
                modifier = Modifier
                    .rotate(180f)
                    .size(40.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(
                    text = text,
                    style = TextStyle(
                        fontSize = 13.sp
                    )
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = author,
                    style = TextStyle(
                        fontWeight = FontWeight.ExtraLight,
                        fontSize = 10.sp
                    )
                )
            }

        }

    }

}

@Preview
@Composable
private fun PreviewQuoteBox(navController: NavController) {
    quoteBox(text = "This is a sample text for this Quote app and i am trying to fill some space ",
        author = "Author Name",
        navController = navController
        )
}
