package com.example.kotlinlearningapp

fun main(args:Array<String>){
    var num="sania"
    var num1="sana"
    println("my name is $num, my sis name is $num1")
    var den=Density()
    den.mass=10.3f
    den.volum=23.5f
    print("mass is ${den.mass} and volume is ${den.volum} and finally density is ${den.mass/den.volum}")
}

class Density{
    var mass:Float=0.0f
    var volum:Float=0.0f
}