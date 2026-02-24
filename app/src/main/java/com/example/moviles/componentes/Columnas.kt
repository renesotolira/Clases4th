package com.example.moviles.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviles.MyTextView

//@Preview (showBackground = true)
@Composable
fun Columnas(){
    var showHola by remember {
        mutableStateOf(false)
    }
    Column(verticalArrangement = Arrangement.Bottom,
        modifier = Modifier.background(Color.Blue).padding(end = 129.dp),
        horizontalAlignment = Alignment.End) {
       ///MyTextView()
        if(showHola){
            MyTextView()
            Text("Hola")
        }else{
        Text("otra cosa")
        }
        Button(onClick = {
            showHola = !showHola
        }) {
            Text("ocultar")

        }
        Spacer(modifier = Modifier.height(20.dp))
        Text("Adios")
        Spacer(modifier = Modifier.height(10.dp))
        Text("Que tal")
        Spacer(modifier = Modifier.height(15.dp))

    }
}
@Preview (showBackground = true)
@Composable
fun Separadores(){
    Column(verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Granados", modifier = Modifier.fillMaxSize().weight(0.25f))
        HorizontalDivider(thickness = 10.dp, color = Color.Red)
        Text("Gudini", modifier = Modifier.fillMaxSize().weight(0.5f))
        Text("Americo", modifier = Modifier.fillMaxSize().weight(0.25f))
        Columnas()
    }
}