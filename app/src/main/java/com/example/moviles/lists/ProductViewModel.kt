package com.example.moviles.lists

import com.example.moviles.R
class ProductViewModel {
    fun getProducts() : List<ProductModel>{
        var productList = mutableListOf<ProductModel>()
        productList.add(ProductModel(imagen = R.drawable.macimage, nombre = "Macbook Air", calificacion = 4.9f, precio = 12000, entrega = "sabado"))
        productList.add(ProductModel(imagen = R.drawable.triceratops, nombre = "Triceratops", calificacion = 5.0f, precio = 15000, entrega = "viernes"))
        productList.add(ProductModel(imagen = R.drawable.macimage, nombre = "Macbook Pro", calificacion = 5.0f, precio = 20000, entrega = "sabado"))
        productList.add(ProductModel(imagen = R.drawable.descarga, nombre = "T-Rex", calificacion = 4.7f, precio = 10000, entrega = "domingo"))
        productList.add(ProductModel(imagen = R.drawable.baseline_bed_24, nombre = "Cama", calificacion = 4.9f, precio = 16000, entrega = "sabado"))
        productList.add(ProductModel(imagen = R.drawable.macimage, nombre = "Macbook Air", calificacion = 4.9f, precio = 12000, entrega = "sabado"))
        productList.add(ProductModel(imagen = R.drawable.macimage, nombre = "Macbook Air", calificacion = 4.9f, precio = 12000, entrega = "sabado"))
        productList.add(ProductModel(imagen = R.drawable.macimage, nombre = "Macbook Air", calificacion = 4.9f, precio = 12000, entrega = "sabado"))
        productList.add(ProductModel(imagen = R.drawable.macimage, nombre = "Macbook Air", calificacion = 4.9f, precio = 12000, entrega = "sabado"))
        productList.add(ProductModel(imagen = R.drawable.macimage, nombre = "Macbook Air", calificacion = 4.9f, precio = 12000, entrega = "sabado"))
        return productList
    }
}
