package com.example.moviles.navegacion

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun ReportView(navegante: NavHostController) {
    var nombreSeccion by remember { mutableStateOf("Nombre de la sección") }
    var numSeccion by remember { mutableStateOf("Numero de la sección") }
    var nombreEncargado by remember { mutableStateOf("Nombre del encargado") }
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Reporte de Ventas")
        Button(onClick = {
            navegante.popBackStack()
        }) {
            Text("Regresar")
        }
        TextField(value = nombreSeccion, onValueChange = { nombreSeccion = it}, label = {Text("Nombre de la sección")})
        TextField(value = numSeccion, onValueChange = {numSeccion = it}, label = {Text("Numero de la sección")})
        TextField(value = nombreEncargado, onValueChange = {nombreEncargado = it}, label = {Text("Nombre del encargado")})
        Button(onClick = {
            navegante.navigate(ReportModel(numSeccion.trim().toInt(),
                nombreEncargado,
                nombreSeccion))
        }) {
            Text("Enviar datos")
        }
    }
}