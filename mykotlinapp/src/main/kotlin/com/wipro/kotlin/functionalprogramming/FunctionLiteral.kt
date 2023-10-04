package com.wipro.kotlin.functionalprogramming

var sayHello: () -> Unit = fun() {
    println("Hello")
}

fun main() {
  sayHello()
}