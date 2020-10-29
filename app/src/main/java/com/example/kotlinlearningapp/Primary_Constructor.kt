package com.example.kotlinlearningapp

fun main(args:Array<String>){

    var dog1=Dog1("black","Bulldog")


}

open class Animal1(color: String){

    init {

        println("color is $color")
    }



}

class Dog1(color:String,breed:String):Animal1(color){
    init {
        println("color is $color and breed is $breed")
    }

}