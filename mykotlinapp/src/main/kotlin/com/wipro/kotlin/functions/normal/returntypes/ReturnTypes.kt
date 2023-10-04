package com.wipro.kotlin.functions.normal.returntypes

//Explicit Unit
fun doStuff(): Unit {
    println("unit")
    return
}

fun doSomething() {
    println("unit")
    return
}

//String
fun sayHello(): String {
    return "Hello"
}

fun add(a: Int = 0, b: Int = 0): Int {
    return a + b
}

fun main() {
    doStuff()
    doSomething()
    println(sayHello())
    println(add(a = 10, b = 90))
}