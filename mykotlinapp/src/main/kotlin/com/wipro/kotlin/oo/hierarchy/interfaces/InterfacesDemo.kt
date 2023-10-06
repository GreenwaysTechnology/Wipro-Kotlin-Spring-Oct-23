package com.wipro.kotlin.oo.hierarchy.interfaces

interface Eatable {
    //open fun eat(): String
    fun eat(): String
}
interface Runnable {
    fun run():String
}

class Dog : Eatable ,Runnable  {
    override fun eat(): String {
        return "Dog eats"
    }

    override fun run(): String {
        return "Dog run"
    }

    fun bark() {
        println("dog barks")
    }
}

fun main() {
    var dog: Eatable = Dog()
    println(dog.eat())
    //dog.bark()
    var tmpDog: Dog = dog as Dog
    tmpDog.bark()

    var newDog = Dog()
    println(newDog.bark())
    println(newDog.eat())
}