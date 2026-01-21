package com.example.moviles.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviles.ui.theme.GoldColor


@Preview(showBackground = true)
@Composable
fun Modificador () {
    Text("Hola Juan",
        modifier = Modifier
            .background(Color(0xFFEC6920))
            .padding(7.dp)
            // .background(Color.Magenta)
            .padding(vertical = 14.dp)
            /*.alpha(0.5f)
            .blur(0.8.dp)
            .border(2.dp, Color.DarkGray)
            .shadow(elevation = 10.dp) */
            .rotate(180f),
        color=GoldColor,
        fontSize = 12.sp
    )

}