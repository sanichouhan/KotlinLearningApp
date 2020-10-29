package com.example.kotlinlearningapp

fun main(args:Array<String>){

    /*  customer.discount()
      customer.sell()*/

    seller.discount()
    seller.sell()

}
class seller{
    var count:Int=-1

    companion object {
        var name:String="sania"
        fun discount(){
            println("50% off")
        }
        fun sell(){
            println("1 to 1 free")
        }
    }
}


/*object customer{
    var name:String="sania"
    fun dsicount(){
        println("50% off")
    }
    fun sell(){
        println("1 to 1 free")
    }
}*/