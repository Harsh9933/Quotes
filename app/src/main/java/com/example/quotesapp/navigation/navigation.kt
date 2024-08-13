package com.example.quotesapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.quotesapp.api.QuoteApi
import com.example.quotesapp.model.Quotes
import com.example.quotesapp.model.quotes
import com.example.quotesapp.screens.quoteDetail
import com.example.quotesapp.screens.quoteList
import javax.inject.Inject

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.MainScreen.route ){
        composable(route = Screen.MainScreen.route){
            quoteList(quotes = quotes, navController = navController)
        }
        composable(
            route = Screen.DetailScreen.route + "/{text}/{author}",
            arguments = listOf(
                navArgument("text"){
                    type = NavType.StringType
                    defaultValue = "Nothing"
                },
                navArgument("author"){
                    type = NavType.StringType
                    defaultValue = "Null"
                }
            )
        ){ entry ->
            quoteDetail(
                text = entry.arguments?.getString("text") ?: "Nothing",
                author =  entry.arguments?.getString("author") ?: "Null",

                )
        }

    }
}