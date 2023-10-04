package com.wipro.kotlin.basics.nulldemo

fun sayHello(name: String? = "") {
    println("Hello ${name} and its length is ${name?.length ?: 0}")
}

fun main() {
    sayHello(null)
    sayHello(name = "Murugan")
}