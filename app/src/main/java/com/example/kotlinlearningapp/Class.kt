package com.example.kotlinlearningapp

fun main(args:Array<String>){
    var name:String
    name="Ali"
    var age:Int
    age=24
    var gender:String
    gender="male"

    var n:String
    var age1:Int
    var dept:String




    //call in main..

    var perObj=Person()

    perObj.display(name, age, gender)

    var stud1Obj=Stud1()

    stud1Obj.display("sana",22,"IT")




}
class Person {
    fun display(name: String, age: Int, gender: String) {
        println(name)
        println(age)
        println(gender)
    }
}

class Stud1{
    fun display(n:String,age1:Int,dept1: String){         //Constructor
        var name:String="sana"
        var age:Int=22
        var dept:String="it"
        println("student name age and department")
        println("$name  $age  $dept")

    }

}



