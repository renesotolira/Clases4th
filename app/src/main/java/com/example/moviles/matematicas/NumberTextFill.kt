package com.example.moviles.matematicas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

//@Preview(showBackground = true)
@Composable
fun NumberTextFill (modificador: Modifier, fill:(String)-> Unit)
{
    var number by remember { mutableStateOf("") }
    Column(modifier = modificador) {
        Text("Ingresa un numero ")
        TextField(value = number, onValueChange = { textoEscrito ->
            if(textoEscrito.toIntOrNull() != null){
                number = textoEscrito.toInt().toString()
                fill(number)
            }
        } )
    }
}

@Preview
@Composable
fun NumberTextFillPreview ()
{ var texto by remember { mutableStateOf("") }
    Column() {
        Text(texto)
    NumberTextFill(Modifier.fillMaxWidth()) {
texto=it
    }
    }
}