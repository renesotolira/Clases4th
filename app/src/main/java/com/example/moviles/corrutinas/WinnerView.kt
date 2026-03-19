package com.example.moviles.corrutinas

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@SuppressLint("ViewModelConstructorInComposable")
@Preview(showBackground = true)
@Composable
fun WinnerPreview(){
    WinnerView(StudentsViewModel())
}


@Composable
fun WinnerView( studentsVM : StudentsViewModel){

    var nombre by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {

        Text("Sorteo alumnos")
        TextField(nombre, onValueChange = {
            nombre = it
        })
        Button(onClick = {
            studentsVM.getWinner()
        }) {
            Text("Comenzar")
        }

        if(studentsVM.isLoading) {
            CircularProgressIndicator(modifier =
                Modifier.size(64.dp))
            Text("Cargando por favor espere...")
        }else {
            Text("El ganador es.... ${studentsVM.winner}")
        }
    }
}