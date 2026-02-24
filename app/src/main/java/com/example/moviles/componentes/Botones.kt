package com.example.moviles.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.moviles.R
import org.w3c.dom.Text

@Preview(showBackground = true)
@Composable


fun Botones() {
    var activo by remember {
        mutableStateOf(false)
    }
    var ruta by remember {
        mutableStateOf(R.drawable.triceratops)
    }

    fun cambiarImagen() {
        if (activo) {
            ruta = R.drawable.triceratops
        } else {
            ruta = R.drawable.descarga
        }
        activo = !activo
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = ruta),
            contentDescription = "icnoo cambiantes"
        )

        Button(
            onClick = { cambiarImagen() },
            colors = ButtonDefaults.buttonColors(
                contentColor = Color(0xFFFFC107),
                containerColor = Color(0xFF03A9F4)
            )
        ) {
            Text(text = "Click me")
        }
    }
}