package com.example.kotlinlearningapp


fun main(args:Array<String>){

    println("${add(1,2)}")

    println("${vol(12,13,14)}")

}

fun add(a:Int, b:Int =4):Int{                    //no preference in 4
    return a+b


}

fun vol(lengthe:Int,width:Int,height:Int=20):Int{          //14  override 20
    return lengthe*width*height

}