package com.wipro.kotlin.functionalprogramming

var sayHello: () -> Unit = fun() {
    println("Hello")
}

//Function with type inference
var greet = fun() {
    println("Greet")
}

fun main() {
    sayHello()
    greet()
}