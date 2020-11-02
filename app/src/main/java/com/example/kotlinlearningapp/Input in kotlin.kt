package com.example.kotlinlearningapp

import java.util.*

fun main(args:Array<String>){
    println("enter the name")
    var name= readLine()   //readline fun just use in String
    println("my name is $name")
    println("enter the age")
    var scanner=Scanner(System.`in`)  //scanner obj use all data type
    var age=scanner.nextInt()
    println("age is $age")
    println("enter the height")
    var height=scanner.nextFloat()
    println("height is $height")
}