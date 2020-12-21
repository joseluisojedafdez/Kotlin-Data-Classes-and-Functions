package com.i4bchile.library

/*
data class Book(val bookTitle:String,
 val isbn:String,
  val yearPub:Int,
  val publisher:String,
  val numPages:Int,
  val price:Int,
  val author:String,
  val bookType:Char)
 */

fun main(){

    val book1=Book("The Hobbit","123456789",1954,"Minotaur",240,9990,"JRR Tolkien",'I')
    var book2=Book("A Tale Of Two Cities","4567890143",2012,"Cinderella Books",540,14990,"Charles Dickens",'D')
    var book3=Book("The Narnia Cronicles: The Lion, The Witch and The Wardrobe","8765453403",1975,"Chillout Books",340,12990,"CS Lewis",'I')
    var book4=Book("The Time Machine, or How to Travel to the Future and Back","201220112010",2009,"Another Books",190,8990,"Marty McFly",'D')


    book1.printBook()
    println ("--------------------------")
    book2.printBook()
    println ("--------------------------")
    book3.printBook()
    println ("--------------------------")
    book4.printBook()
    println ("--------------------------")



}