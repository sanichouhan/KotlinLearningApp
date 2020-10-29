package com.example.kotlinlearningapp

fun main(args:Array<String>){

    var student1=Student1("Maha",12)

    println("${student1.name}")
    println("${student1.id}")





}

class Student1(name:String) {
    var name = name
    var id = 10


    constructor(name: String, id: Int) : this(name) {


    }


}