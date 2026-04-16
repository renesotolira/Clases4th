package com.example.moviles.api

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import coil3.compose.AsyncImage


@Composable
fun DogView(dogViewModel: DogViewModel){
    var razaEscrita by remember {
        mutableStateOf("")
    }
    val imagenes by dogViewModel.images.collectAsState()
    Column(Modifier.fillMaxSize()) {
        Text("El cachorro de hoy es:")
        TextField( razaEscrita, onValueChange = {
            razaEscrita = it
        })
        Button(onClick = {
            dogViewModel.fetchImagesList(razaEscrita)
        }) {
            Text("Mostar imagenes")
        }
        LazyColumn() {
            items(imagenes){
                Text(it)
                AsyncImage(
                    model = it,
                    contentDescription = null,
                )
            }
        }



        Button(onClick = {
            dogViewModel.traerUrlImagen()
        }) {
            Text("Mostar imagen")
        }
        Text(dogViewModel.url)
        if(dogViewModel.url.isNotBlank()) {
            AsyncImage(
                model = dogViewModel.url,
                contentDescription = null,
            )
        }



    }
}