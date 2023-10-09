package com.wipro.kotlin.oo.innerclasses

class Greetings {
    fun sayHello() {
        println("Factory")
    }

    object Factory {
        fun createInstance(): Greetings = Greetings()
    }
}

class Hello {
    companion object Factory {
        fun createInstance(): Greetings = Greetings()
    }
    fun sayHello() {
        println("Factory")
    }
}

//
fun main() {
    Greetings.Factory.createInstance().sayHello()
    //companion objects are used to access its properties with outer class
    Hello.createInstance().sayHello()
}