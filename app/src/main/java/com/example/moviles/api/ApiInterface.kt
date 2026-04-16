package com.example.moviles.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.Path

interface ApiInterface {

  @GET("breeds/image/random")
  suspend fun imagenAleatoria(): Response<ImagenRandom>

    @GET("breed/{raza}/images")
    suspend fun listaImagenesDePerrosPorRaza(
        @Path("raza") raza: String):
            Response<ImagenesRaza>

}


