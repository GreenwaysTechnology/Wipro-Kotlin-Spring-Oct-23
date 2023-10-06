package com.wipro.kotlin.oo.hierarchy

//base class
open class Animal {
    init {
        println("Animal constructor is running")
    }
}

//child class
class Dog : Animal() {
    init {
        println("Dog constructor is running")
    }
}

fun main() {
    var dog = Dog()
}