package com.i4bchile.library
/*
Nombre del libro.
● ISBN.
● Año publicación
● Editorial
● Cantidad de páginas
● Precio
● Autor del libro
● Tipo de libro (D: Digital / I: Impreso)
 */
data class Book(val bookTitle:String, val isbn:String, val yearPub:Int, val publisher:String, val numPages:Int, val price:Int, val author:String, val bookType:Char)
