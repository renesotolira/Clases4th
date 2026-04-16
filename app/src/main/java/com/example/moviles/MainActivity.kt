package com.example.moviles

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.moviles.api.DogView
import com.example.moviles.api.DogViewModel
import com.example.moviles.corrutinas.StudentsViewModel
import com.example.moviles.corrutinas.WinnerView
import com.example.moviles.navegacion.NavManager
import com.example.moviles.persistencia.ProfileView
import com.example.moviles.ui.theme.MovilesTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("ViewModelConstructorInComposable")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MovilesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val dogViewModel = DogViewModel()
                    DogView(dogViewModel)

                }
            }
        }
    }
}

