package com.i4bchile.library

fun formatPrice(pPrice:Int):String{
    val priceFormatted="$$pPrice"
    return priceFormatted
}


fun Book.printBook(){
    println("Author: ${author}")
    println("Title: ${bookTitle}")
    println("Publisher: ${publisher}")
    println("Year: ${yearPub}")
    println("Price: ${formatPrice(price)}")
    println("Pages: ${numPages}")
    println("Book Type: ${bookType}")
}