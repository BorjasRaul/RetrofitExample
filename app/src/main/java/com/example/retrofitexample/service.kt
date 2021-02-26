package com.example.retrofitexample

import com.example.retrofitexample.PokemonDataCollection.PokemonDataCollec
import com.example.retrofitexample.PokemonDataCollection.PokemonDataCollection
import retrofit2.Call
import retrofit2.http.GET

interface service {
        @GET("pokemon")
        fun listPokemon(): Call<List<PokemonDataCollection>>
}