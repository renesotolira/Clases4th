package com.example.moviles.tareas

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable

@Serializable
object Home

@Serializable
object Insertar
@Serializable
data class EdadCalculo(val edad: Int)


@Preview(showBackground = true)
@Composable
fun NavManager(){
    val navController = rememberNavController()
    NavHost(navController, startDestination = Home ) {
        composable<Home>{
            HomeView(navController)
        }
        composable<Insertar>{
            InsertarEdad(navController)
        }
        composable<EdadCalculo> {
            val datos: EdadCalculo = it.toRoute()
            EdadView(datos.edad, navController)
        }
    }

}