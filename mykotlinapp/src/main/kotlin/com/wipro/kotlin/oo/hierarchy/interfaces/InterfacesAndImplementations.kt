package com.wipro.kotlin.oo.hierarchy.interfaces

interface MyInterface {
    fun sayHello():String
    fun doStuff(){
        println("MyInterface")
    }
}
interface FooInterface {
    fun sayHai():String
    fun doStuff(){
        println("FooInterface")
    }
}
class Implementator: MyInterface,FooInterface {
    override fun sayHai(): String {
        TODO("Not yet implemented")
    }

    override fun sayHello(): String {
        TODO("Not yet implemented")
    }

    override fun doStuff() {
        super<FooInterface>.doStuff()
    }
}

fun main() {
    var bar = Implementator()
    bar.doStuff()
}