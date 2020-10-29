package com.example.kotlinlearningapp

fun main(args:Array<String>){
    var tesObj=Test1()
    tesObj.test()

    var indObj=India()
    indObj.display()


}

//private,public,protected and internal kotlin modifer.

class Test1{
    fun test(){

        //a,d is visible and private and protected is not visible
        var tes2Obj = Test2()
        println(tes2Obj.a)
        //  println(tesObj.b)
        //  println(tesObj.c)
        println(tes2Obj.d)
    }

}

open class Test2{

    public val a=3
    protected val b=4
    private val c=3
    internal val d=14

}

class India:Test2() {
    //a,b,d visible in the class but c is not visible because these are private

    fun display() {
        println(a)
        println(b)
        //  println(c)   private
        println(d)
    }

}





