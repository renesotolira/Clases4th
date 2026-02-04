package com.example.moviles.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircleOutline
import androidx.compose.material.icons.filled.Egg
import androidx.compose.material.icons.filled.Light
import androidx.compose.material.icons.filled.Palette
import androidx.compose.material.icons.outlined.Light
import androidx.compose.material.icons.rounded.Light
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviles.R

@Preview(showBackground = true)
@Composable

fun Imagenes(){

    Column(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(R.drawable.triceratops),
            contentDescription = "foto de dinosaurio",
            modifier = Modifier.size(200.dp).clip(CircleShape),
            contentScale = ContentScale.FillHeight
            )
        Icon(painter = painterResource(R.drawable.baseline_bed_24),
            contentDescription = null,
            tint = Color(0xFFEA2222)
            )

        Icon(imageVector = Icons.Filled.Palette,
            contentDescription = null,
            modifier = Modifier.size(200.dp),
            tint = Color(0xFFEA2222)
            )

    }
}


