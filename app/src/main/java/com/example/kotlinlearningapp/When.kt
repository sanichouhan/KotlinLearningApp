package com.example.kotlinlearningapp

fun main(args:Array<String>){

    val x=2
    var srt:String
    when(x){
        1->srt="x in 1"
        2->srt="x is 2"
        3->srt="x is 3"
        else->
            srt="x is known"



    }
    println("$srt")

}