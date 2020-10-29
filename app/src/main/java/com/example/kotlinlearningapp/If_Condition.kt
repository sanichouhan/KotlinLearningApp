package com.example.kotlinlearningapp

fun main(args:Array<String>){
    var a=10
    var b=12
    var c=13
    var d=1

    var max:Int
    if(a>b){
        println("max value is a")
        max=a
    }
    if(b>c){
        println("max value is b")
        max=b
    }
    if(c>d){
        println("max value is c")
        max=c
    }
    else{
        println("max value is d")
        max=d

    }
    print(max)



}




