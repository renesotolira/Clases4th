package com.example.moviles

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.style.TextOverflow.Companion
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun MyTextView(){
    val myFontColor = Color.Red
    val tamanioFuente = 50.sp

    Text( text = stringResource(R.string.hello_world),
        color = myFontColor,
        fontSize = tamanioFuente,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Light,
        fontFamily = FontFamily.Cursive,
        letterSpacing = 20.sp, //espacio entre letras
        lineHeight = 77.sp, //espacio entre renglones
        textDecoration = TextDecoration.Underline,
        textAlign = TextAlign.Justify,
        maxLines = 4,
        overflow = TextOverflow.Ellipsis
        //minLines = 5
        )
}
