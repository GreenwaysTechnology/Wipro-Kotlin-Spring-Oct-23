package com.wipro.kotlin.oo.hierarchy.abstractclasses

open class LivingThings {
    open fun walk() {
        println("Animal walk")
    }
}

//valid
//open abstract class Animal : LivingThings() {
//    abstract fun eat()
//    fun saveAnimals() {
//        println("Save Animals")
//    }
//}
//valid
abstract class Animal : LivingThings() {
    abstract fun eat()
    fun saveAnimals() {
        println("Save Animals")
    }
}

class Dog : Animal() {
    override fun eat() {
        println("Dog eats")
    }

    override fun walk() {
        println("Dog walk")
    }
}


fun main() {
    val dog: Animal = Dog()
    dog.eat()
    dog.saveAnimals()
    dog.walk()
}