package com.example.moviles.api

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class DogViewModel: ViewModel() {
    var url by mutableStateOf("")
        private set

    private val _images = MutableStateFlow<List<String>> (emptyList())
    val images = _images.asStateFlow()

    fun traerUrlImagen(){
        val api = API()
        viewModelScope.launch {
            withContext(Dispatchers.IO){
               url = api.getImagenAleatoria()
            }
        }
    }

    fun fetchImagesList(breed: String){
        val api = API()
        viewModelScope.launch {
            withContext(Dispatchers.IO){
               _images.value = api.getListImages(breed)
                //images = _images
            }
        }
    }

}