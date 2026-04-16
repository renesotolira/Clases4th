package com.example.moviles.tareas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.moviles.R


@Composable
fun EdadView(edad : Int, navegante : NavHostController){

    val mensaje = when (edad) {
        in 0..14 -> "Menor de edad"
        15 -> "Mayor de edad en Indonesia pero no en México"
        16 -> "Mayor de edad en Cuba pero no en México"
        17 -> "Mayor de edad en Corea del Norte pero no en México"
        18 -> "Mayor de edad en México y gran parte de Latinoamérica"
        19 -> "Mayor de edad en Corea del Sur"
        20 -> "Mayor de edad en Japón"
        in 21 .. 59 -> "Mayor de edad en USA y posiblemente en todo el mundo"
        in 60..64 -> "Eres de la tercera edad"
        else -> "Ya te puedes jubilar"
    }
    val imagen = when (edad) {
        in 0..14 -> R.drawable.nino
        in 15..59 -> R.drawable.joven
        else -> R.drawable.cat_deportes
    }

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Card(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(8.dp)
        ) {

            Column(
                modifier = Modifier.fillMaxWidth().padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(onClick = {
                    navegante.popBackStack()
                }) {
                    Text("Regresar")
                }
                Text(text = "Tu edad es: $edad")
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = mensaje)
                Spacer(modifier = Modifier.height(16.dp))
                Image(
                    painter = painterResource(id = imagen),
                    contentDescription = null,
                    modifier = Modifier.height(180.dp)
                )
            }
        }
    }







}