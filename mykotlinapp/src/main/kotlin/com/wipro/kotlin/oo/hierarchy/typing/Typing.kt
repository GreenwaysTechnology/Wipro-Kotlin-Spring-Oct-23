package com.wipro.kotlin.oo.hierarchy.typing

//base class
open class Animal {
    open fun eat() {
        println("animal eat")
    }
}

//child class
class Dog : Animal() {

    override fun eat() {
        println("dog eats")
    }

    fun bark() {
        println("dog is barking")
    }
}

fun main() {
    //program to sub type
    var dog: Dog = Dog()
    dog.eat()
    //program to super type
    var mydog: Animal = Dog()
    mydog.eat()
    //mydog.bark()
    var tmpDog = mydog as Dog
    tmpDog.bark()
}