package com.example.moviles.componentes

import android.R
import android.text.Layout
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)

@Composable
fun Cajas() {
    Box(modifier = Modifier.fillMaxSize()) {
        CajaInterna( alineacion = Alignment.TopStart)
        CajaInterna( alineacion = Alignment.BottomEnd)
    }
}


//@Preview(showBackground = true)
@Composable
fun CajaInterna( alineacion: Alignment ){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = alineacion) {
        Box(modifier = Modifier.size(300.dp)) {
            Text(
                "A",
                Modifier.background(color = Color.Blue).align(Alignment.TopStart).size(40.dp), color = Color.White
            )

            Text(
                "B",
                Modifier.background(color = Color.Red).align(Alignment.TopCenter).size(40.dp),
                color = Color.White
            )
            Text(
                "C",
                Modifier.background(color = Color.Green).align(Alignment.TopEnd).size(40.dp),
                color = Color.White
            )
            Text(
                "D",
                Modifier.background(color = Color.Yellow).align(Alignment.CenterStart).size(40.dp),
                color = Color.Black
            )
            Text(
                "E",
                Modifier.background(color = Color.Cyan).align(Alignment.Center).size(40.dp),
                color = Color.Black
            )
            Text(
                "F",
                Modifier.background(color = Color.Magenta).align(Alignment.CenterEnd).size(40.dp),
                color = Color.White
            )
            Text(
                "G",
                Modifier.background(color = Color.Green).align(Alignment.BottomStart).size(40.dp),
                color = Color.Black
            )
            Text(
                "H",
                Modifier.background(color = Color.DarkGray).align(Alignment.BottomCenter)
                    .size(40.dp),
                color = Color.White
            )
            Text(
                "I",
                Modifier.background(color = Color.LightGray).align(Alignment.BottomEnd).size(40.dp),
                color = Color.Black
            )
        }
    }
}