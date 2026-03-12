package com.example.moviles.corrutinas

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import java.lang.Thread.sleep

class StudentsViewModel: ViewModel() {
    var winner by mutableStateOf("")

    fun getWinner(){
        winner = ""
        sleep(5000)
        winner = "Juan Perez Perez"
    }

}