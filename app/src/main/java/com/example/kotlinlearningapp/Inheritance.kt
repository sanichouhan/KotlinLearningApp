package com.example.kotlinlearningapp


fun main(args:Array<String>){
    /* var cat=Cat()
     cat.legs="two"
     cat.color="white"
     cat.manu()
     cat.eat()
     var dog=Dog()
     dog.color="black"
     dog.age="3"
     dog.eat()
     dog.broken()
     dog.run()*/
    //method Override...........
    var dog=Dog()
    dog.eat()
    println("${dog.color}")


}

open class Animal{
    open var color:String="white "
    open fun eat(){
        println(" animal is Eating")
    }


}

class Cat:Animal(){
    var legs:String=""
    fun manu(){
        println("maooooo")
    }
}

class Dog:Animal() {
    override var color: String = "black"

    var age: String = "12"
    fun broken() {
        println("Broken")
    }

    override fun eat() {
        super.eat()
        println("dog is eating")
    }

    fun run() {
        println("dog running fast")
    }
}
