package com.example.moviles.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable

fun Filas(){

    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.CenterVertically){
        Text("uno")
        VerticalDivider()

        Column(){
            Text("dos")
            Text("4")
            Text("5")
            Text("6")
        }

        Column(Modifier.width(100.dp)) {
            Text("tres")
            Row() {

                Box(Modifier.background(Color.Red).width(20.dp).height(20.dp)) {
                }
                Box(Modifier.background(Color.Blue).width(50.dp).height(20.dp)) {
                }
            }

            Row() {
                Box(Modifier.background(Color.Black).width(50.dp).height(20.dp)) {
                }
                Box(Modifier.background(Color.Red).width(20.dp).height(20.dp)) {
                    Text("Hola", color=Color.White)
                    Text("Adios", color=Color.Yellow)
                }

            }

        }
    }
}
