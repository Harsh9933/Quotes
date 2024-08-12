package com.example.quotesapp.model

data class Quotes(
    val text:String,
    val author:String
)
val quotes = listOf(
    Quotes("The only limit to our realization of tomorrow is our doubts of today.", "Franklin D. Roosevelt"),
    Quotes("In the end, we will remember not the words of our enemies, but the silence of our friends.", "Martin Luther King Jr."),
    Quotes("To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment.", "Ralph Waldo Emerson"),
    Quotes("Life is what happens when you're busy making other plans.", "John Lennon"),
    Quotes("The best way to predict the future is to create it.", "Peter Drucker"),
    Quotes("Do not wait to strike till the iron is hot; but make it hot by striking.", "William Butler Yeats"),
    Quotes("The only way to do great work is to love what you do.", "Steve Jobs"),
    Quotes("Success is not final, failure is not fatal: It is the courage to continue that counts.", "Winston Churchill"),
    Quotes("You miss 100% of the shots you don’t take.", "Wayne Gretzky"),
    Quotes("In three words I can sum up everything I've learned about life: it goes on.", "Robert Frost"),
    Quotes("The purpose of our lives is to be happy.", "Dalai Lama"),
    Quotes("It does not matter how slowly you go as long as you do not stop.", "Confucius")
)