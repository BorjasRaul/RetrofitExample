package com.example.retrofitexample.PokemonDataCollection

class PokemonDataCollec : ArrayList<PokemonDataCollection>()

    data class PokemonDataCollection(
        val name:String,
        val url:String
        )

