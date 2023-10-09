package com.wipro.kotlin.oo.hierarchy.sam

//java style interface
interface Greeter {
    fun greet(): Unit  //single methods
    //fun hello():Unit
}
class GreeterImpl:Greeter {
    override fun greet() {
        println("Greet")
    }
}

fun main() {
    val greeter = GreeterImpl()
    greeter.greet()

    //anonymous implementation.
    var mygreet = object : Greeter {
        override fun greet() {
            println("Anonmous implementation")
        }
    }
    mygreet.greet()
}