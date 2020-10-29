package com.example.kotlinlearningapp

fun main(args:Array<String>){

    var cat1=Cat2("yellow","pigen")

}

open class Animal2{
    var color:String=""

    constructor(color:String){
        this.color=color
        println("animal color is $color")
    }

}
class Cat2:Animal2{
    var breed1:String
    constructor(color: String,breed1:String):super(color){
        this.breed1=breed1
        println("cat color is $color and breed is $breed1")

    }

}
