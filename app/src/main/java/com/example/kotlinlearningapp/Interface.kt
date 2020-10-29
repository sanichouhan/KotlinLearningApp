package com.example.kotlinlearningapp

fun main(args:Array<String>){
    var parentss=parents()
    println(parentss.name)
    println(parentss.age)
    parentss.run()
    parentss.eat()
    parentss.mute()
    parentss.speack()

}
interface mylistenerinterface{
    var name:String
    fun run(){
        println("interface is running")

    }
    fun eat()
}
interface mysecondinterface{
    var age:String
    fun speack(){
        println("my second interface")
    }
    fun mute()
}


class parents:mylistenerinterface,mysecondinterface{
    override var name:String="sania"
    override fun eat(){
        println("parent is eating")
    }
    override fun run(){
        super.run()
        println("parents is running")
    }

    override fun mute() {
        println("i m mutable")
    }

    override var age: String="three"

    override fun speack(){
        super.speack()
        println("parent is speack")
    }


}