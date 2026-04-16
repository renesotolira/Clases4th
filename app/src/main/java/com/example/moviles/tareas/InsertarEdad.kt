package com.example.moviles.tareas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun InsertarEdad(navegante: NavHostController) {
    var edad by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        TextField(
            value = edad,
            onValueChange = { edad = it },
            label = { Text("Ingresa tu año de nacimiento") })
        Spacer(modifier = Modifier.height(16.dp))
        FloatingActionButton(onClick = {
            val nacimiento = edad.toIntOrNull()
            if (nacimiento != null) {
                val actual = 2026
                val edadCalculada = actual - nacimiento
                navegante.navigate(EdadCalculo(edadCalculada))
            }
        }
        ) {
            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = "Calcula  edad"
            )
        }


    }

}

