package com.example.moviles.componentes

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Minimize
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviles.matematicas.NumberTextFill

@Preview(showBackground = true)
@Composable
fun CajasTexto(){
    var number by remember {
        mutableStateOf("")
    }
    var number2 by remember {
        mutableStateOf("")
    }
    var result by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center) {
        Row(modifier = Modifier.fillMaxWidth()){
            NumberTextFill(modificador = Modifier.fillMaxWidth().weight(2f)){ number=it }
            Spacer(modifier = Modifier.fillMaxWidth().weight(1f))
            NumberTextFill(modificador = Modifier.fillMaxWidth().weight(2f)){ number2=it }

        }////
        Spacer(modifier = Modifier.height(16.dp))
        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
            OutlinedButton (onClick = {}) {
                Text("Restar")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Text("Borrar todo", modifier = Modifier.clickable(
                onClick = {
                    result = ""
                    number = ""
                    number2 = ""
                }
            ))
            Spacer(modifier = Modifier.width(8.dp))
            IconButton(onClick = {
                if(number.toIntOrNull() != null && number2.toIntOrNull() != null){
                    result = (number.toInt() + number2.toInt()).toString()
                }else{
                    result = "Favor ingresa solo numeros"
                }
            }) {
                Icon( imageVector = Icons.Default.Add, contentDescription = "sumar")
            }
        }
        Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
            Button (onClick = {}) {
                Text("Multiplicar")
            }
            TextButton(onClick = {}) {
                Text("Dividir")
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(result)
    }
}