package com.example.kotlinlearningapp

fun main(args:Array<String>){
    var s=Student()
    println("${s.haspased(55)}")
    println("${s.hassfirstdivision(90)}")



}


fun Student.hassfirstdivision(marks: Int):Boolean{
    return marks>95

}


class Student {
    fun haspased(marks: Int): Boolean {
        return marks > 50
    }

}