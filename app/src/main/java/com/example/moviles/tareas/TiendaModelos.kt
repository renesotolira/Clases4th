package com.example.moviles.tareas

import androidx.annotation.DrawableRes
import androidx.lifecycle.ViewModel
import com.example.moviles.R

data class Categoria(
    val id: Int,
    val nombre: String,
    @DrawableRes val imagen: Int
)

data class Producto(
    val id: Int,
    val nombre: String,
    val precio: Float,
    @DrawableRes val imagen: Int,
    val envioGratis: Boolean,
    val tieneDescuento: Boolean
)

class CategoriaViewModel : ViewModel() {
    fun obtenerCategorias(): List<Categoria> {
        return listOf(
            Categoria(1, "Papelería", R.drawable.cat_papeleria),
            Categoria(2, "Maquillaje", R.drawable.cat_maquillaje),
            Categoria(3, "Tecnología", R.drawable.cat_tecnologia),
            Categoria(4, "Juguetes", R.drawable.cat_juguetes),
            Categoria(5, "Deportes", R.drawable.cat_deportes)
        )
    }
}

class ProductoViewModel : ViewModel() {
    // Categoría 1: Papelería
    fun productosPapeleria(): List<Producto> = listOf(
        Producto(1, "Cuaderno Profesional", 85f, R.drawable.pap_cuaderno, true, false),
        Producto(2, "Set 12 Colores", 120f, R.drawable.pap_colores, true, true),
        Producto(3, "Mochila Escolar", 450f, R.drawable.pap_mochila, true, false),
        Producto(4, "Calculadora Científica", 320f, R.drawable.pap_calc, false, true),
        Producto(5, "Estuche de Plumones", 210f, R.drawable.pap_plumones, true, false)
    )

    // Categoría 2: Maquillaje
    fun productosMaquillaje(): List<Producto> = listOf(
        Producto(6, "Labial Matte Red", 150f, R.drawable.maq_labial, false, true),
        Producto(7, "Base de Maquillaje", 280f, R.drawable.maq_base, true, false),
        Producto(8, "Paleta de Sombras", 420f, R.drawable.maq_sombras, true, true),
        Producto(9, "Máscara para Pestañas", 110f, R.drawable.maq_rimel, false, false),
        Producto(10, "Set de Brochas", 350f, R.drawable.maq_brochas, true, false)
    )

    // Categoría 3: Tecnología
    fun productosTecno(): List<Producto> = listOf(
        Producto(11, "Audífonos Bluetooth", 899f, R.drawable.tec_audifonos, true, true),
        Producto(12, "Mouse Gamer", 450f, R.drawable.tec_mouse, true, false),
        Producto(13, "Teclado Mecánico", 1200f, R.drawable.tec_teclado, true, true),
        Producto(14, "Cargador Carga Rápida", 300f, R.drawable.tec_cargador, false, false),
        Producto(15, "Power Bank 10k", 550f, R.drawable.tec_power, true, false)
    )

    // Categoría 4: Juguetes
    fun productosJuguetes(): List<Producto> = listOf(
        Producto(16, "Figura de Acción", 250f, R.drawable.jug_figura, false, true),
        Producto(17, "Lego Set Clásico", 600f, R.drawable.jug_lego, true, false),
        Producto(18, "Muñeca Articulada", 380f, R.drawable.jug_muneca, true, false),
        Producto(19, "Carro a Control", 750f, R.drawable.jug_carro, true, true),
        Producto(20, "Juego de Mesa", 420f, R.drawable.jug_mesa, false, false)
    )

    // Categoría 5: Deportes
    fun productosDeportes(): List<Producto> = listOf(
        Producto(21, "Balón de Fútbol", 350f, R.drawable.dep_balon, true, false),
        Producto(22, "Mancuernas 5kg", 480f, R.drawable.dep_pesa, false, true),
        Producto(23, "Tapete de Yoga", 290f, R.drawable.dep_tapete, true, false),
        Producto(24, "Cuerda para Saltar", 120f, R.drawable.dep_cuerda, false, false),
        Producto(25, "Botella de Agua 1L", 180f, R.drawable.dep_botella, true, true)
    )
}