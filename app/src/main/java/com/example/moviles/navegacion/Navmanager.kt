package com.example.moviles.navegacion

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable

@Serializable
object Home

@Serializable
object Report

@Serializable
data class ReportModel(val numeroSeccion : Int,
                       val nombreEncargado : String,
                       val nombreSeccion : String)
@Preview(showBackground = true)
@Composable
fun NavManager(innerPadding: PaddingValues = PaddingValues(16.dp)) {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Home,
        modifier = Modifier.padding(innerPadding)) {
        composable<Home> {
            HomeView(navController)
        }
        composable<Report> {
            ReportView(navController)
        }
        composable <ReportModel> {
            val datos : ReportModel = it.toRoute()
            PDFView(datos)
        }
    }
}
