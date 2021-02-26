package com.example.retrofitexample

import android.app.Service
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.retrofitexample.PokemonDataCollection.PokemonDataCollection
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_mostrar= findViewById<Button>(R.id.btn_show)
        btn_mostrar.setOnClickListener{ v -> callServiceGetPokemon()  }

    }

    private fun callServiceGetPokemon() {
        val pokemonService: service = Rest.getRest().create(service::class.java)
        val result: Call<List<PokemonDataCollection>> = pokemonService.listPokemon()

        result.enqueue(object : Callback<List<PokemonDataCollection>> {
            override fun onFailure(Call: Call<List<PokemonDataCollection>>, t: Throwable){
                Toast.makeText(this@MainActivity,"Error",Toast.LENGTH_LONG).show()
            }
            override fun onResponse(
                call: Call<List<PokemonDataCollection>>,
                response: Response<List<PokemonDataCollection>>
            ) {
                Toast.makeText(this@MainActivity,"Error",Toast.LENGTH_LONG).show()
            }

        })
    }
}