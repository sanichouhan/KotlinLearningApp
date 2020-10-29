package com.example.kotlinlearningapp


//start with {}
fun main(args:Array<String>){


    val data={x:Int,y:Int->x+y}
    println("add two values = ${data(1,3)}")


    val sub={a:Int,b:Int->a-b}
    println("subtract two values = ${sub(8,1)}")





}