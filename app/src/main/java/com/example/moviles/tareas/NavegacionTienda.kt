package com.example.moviles.tareas


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavPrincipal() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "inicio") {
        composable("inicio") { PantallaInicio(navController) }
        composable("papeleria") { PantallaPapeleria(navController) }
        composable("maquillaje") { PantallaMaquillaje(navController) }
        composable("tecno") { PantallaTecno(navController) }
        composable("juguetes") { PantallaJuguetes(navController) }
        composable("deportes") { PantallaDeportes(navController) }
    }
}

@SuppressLint("ViewModelConstructorInComposable")
@Composable
fun PantallaInicio(navController: androidx.navigation.NavController) {
    val categorias = CategoriaViewModel().obtenerCategorias()

    Column(modifier = Modifier.fillMaxSize().background(Color(0xFFF5F5F5))) {
        Text(
            "Categorías Destacadas",
            Modifier.padding(16.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(categorias) { cat ->
                Card(
                    modifier = Modifier.size(width = 140.dp, height = 180.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(4.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize().padding(8.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = cat.imagen),
                            contentDescription = null,
                            modifier = Modifier.size(70.dp)
                        )
                        Spacer(Modifier.height(10.dp))
                        Text(cat.nombre, fontWeight = FontWeight.Bold, fontSize = 14.sp)

                        Button(
                            onClick = {
                                val ruta = when(cat.id) {
                                    1 -> "papeleria"
                                    2 -> "maquillaje"
                                    3 -> "tecno"
                                    4 -> "juguetes"
                                    else -> "deportes"
                                }
                                navController.navigate(ruta)
                            },
                            modifier = Modifier.fillMaxWidth().height(35.dp),
                            contentPadding = PaddingValues(0.dp)
                        ) {
                            Text("Ver", fontSize = 12.sp)
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAppMercadoLibre() {
    NavPrincipal()
}