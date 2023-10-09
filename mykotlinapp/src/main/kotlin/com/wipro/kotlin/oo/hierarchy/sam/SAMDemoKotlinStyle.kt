package com.wipro.kotlin.oo.hierarchy.sam

//kotlin style
fun interface Hello {
    fun sayHello(): Unit
}

fun interface Predicate {
    fun accept(i: Int): Boolean
}

fun main() {
    var hello = object : Hello {
        override fun sayHello() {
            println("Hello")
        }
    }
    hello.sayHello()
    //Lambda notation
    var myHello = Hello {
        println("Hello")
    }
    var isEven = Predicate { it % 2 == 0 }
    println(isEven.accept(33))
}