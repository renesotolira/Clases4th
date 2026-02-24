package com.example.moviles.lists

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviles.R


@Preview(showBackground = true)
@Composable
fun ProductPreview(){
    val computadora = ProductModel(imagen = R.drawable.macimage, nombre = "Macbook Air", calificacion = 4.9f, precio = 12000, entrega = "sabado")
    ProductView(computadora){

    }
}
@Composable
fun ProductView(producto: ProductModel, selected:()-> Unit){
    var agregado by remember{ mutableStateOf( false) }
    var resultado by remember{ mutableStateOf( "") }

    fun addToCart(){
        agregado = !agregado
        if(agregado){
            resultado = "Agregaste ${producto.nombre} al carrito"
        }else {
           resultado = ""
        }
    }

    //var imagen: Int = R.drawable.descarga
    //var nombre: String = "triceratop"
    //var calificacion: Float = 5.0f
    //var precio: Int = 13000
    //var entrega: String = "sabado"
    Column() {
        Card(
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Row() {
                    Image(
                        painter = painterResource(producto.imagen),
                        contentDescription = "imagen de producto",
                        modifier = Modifier.size(120.dp).align(Alignment.CenterVertically)
                    )
                    Column(modifier = Modifier.padding(5.dp)) {
                        Spacer(modifier = Modifier.size(10.dp))
                        Text((producto.nombre), fontSize = 20.sp)
                        Text("⭐${producto.calificacion} estrellas", fontSize = 17.sp)
                        Text("$${producto.precio}", fontSize = 14.sp, fontWeight = FontWeight.Bold)
                        Text("Llega el ${producto.entrega}")
                        Spacer(modifier = Modifier.size(10.dp))
                        Button(
                            onClick = {addToCart()
                                      selected()}, colors = ButtonDefaults.buttonColors(

                                containerColor = Color.Yellow,
                                contentColor = Color.Black
                            )
                        ) {
                            Text("Agregar al carrito")
                        }
                        Spacer(modifier = Modifier.size(10.dp))

                    }
                }
            }
        }
        Text(resultado)
    }

}