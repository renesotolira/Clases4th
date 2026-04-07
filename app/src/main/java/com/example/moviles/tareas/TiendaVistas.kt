package com.example.moviles.tareas


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
@Composable
fun CardProducto(prod: Producto) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Row(modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = prod.imagen),
                contentDescription = null,
                modifier = Modifier.size(80.dp),
                contentScale = ContentScale.Fit
            )
            Column(modifier = Modifier.padding(start = 12.dp)) {
                Text(text = prod.nombre, fontSize = 14.sp)
                Text(text = "$${prod.precio} MXN", fontWeight = FontWeight.Bold, fontSize = 18.sp)

                if (prod.envioGratis) {
                    Text("Envío gratis", color = Color(0xFF00A650), fontSize = 12.sp, fontWeight = FontWeight.Bold)
                }
                if (prod.tieneDescuento) {
                    Text("OFERTA DEL DÍA", color = Color.Red, fontSize = 10.sp, fontWeight = FontWeight.Black)
                }
                Button(onClick = {}, modifier = Modifier.height(30.dp), contentPadding = PaddingValues(0.dp)) {
                    Text("Comprar", fontSize = 12.sp)
                }
            }
        }
    }
}
@Composable
fun PantallaPapeleria(navController: NavHostController) {
    val productos = ProductoViewModel().productosPapeleria()
    Column {
        Button(onClick = { navController.popBackStack() }, Modifier.padding(8.dp)) { Text("Volver") }
        LazyColumn { items(productos) { CardProducto(it) } }
    }
}
@Composable
fun PantallaMaquillaje(navController: NavHostController) {
    val productos = ProductoViewModel().productosMaquillaje()
    Column {
        Button(onClick = { navController.popBackStack() }, Modifier.padding(8.dp)) { Text("Volver") }
        LazyColumn { items(productos) { CardProducto(it) } }
    }
}
@Composable
fun PantallaTecno(navController: NavHostController) {
    val productos = ProductoViewModel().productosTecno()
    Column {
        Button(onClick = { navController.popBackStack() }, Modifier.padding(8.dp)) { Text("Volver") }
        Text("Tecnología", Modifier.padding(8.dp), fontWeight = FontWeight.Bold)
        LazyVerticalGrid(columns = GridCells.Fixed(2)) {
            items(productos) { CardProducto(it) }
        }
    }
}
@SuppressLint("ViewModelConstructorInComposable")
@Composable
fun PantallaJuguetes(navController: NavHostController) {
    val productos = ProductoViewModel().productosJuguetes()
    Column {
        Button(onClick = { navController.popBackStack() }, Modifier.padding(8.dp)) { Text("Volver") }
        Text("Juguetes", Modifier.padding(8.dp), fontWeight = FontWeight.Bold)
        LazyHorizontalGrid(rows = GridCells.Fixed(2), modifier = Modifier.height(400.dp)) {
            items(productos) { CardProducto(it) }
        }
    }
}
@Composable
fun PantallaDeportes(navController: NavHostController) {
    val productos = ProductoViewModel().productosDeportes()
    Column {
        Button(onClick = { navController.popBackStack() }, Modifier.padding(8.dp)) { Text("Volver") }
        LazyColumn { items(productos) { CardProducto(it) } }
    }
}