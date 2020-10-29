package com.example.kotlinlearningapp

fun main(args:Array<String>){
    var user1=User("sania",2)
    var user2=User("sania",2)
    println(user2.copy("ali"))

    println(user1.copy("sazia"))
    if(user1==user2){
        println("equals")
    }else
    {
        print("not equal")
    }
    var newuser=user1.copy("mohsin")
    println(newuser)



}

data class User(var name:String,var id:Int) {

}