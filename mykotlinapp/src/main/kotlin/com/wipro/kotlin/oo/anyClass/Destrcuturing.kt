package com.wipro.kotlin.oo.anyClass

data class Person(var id: Int, var name: String, var city: String)

fun main() {
    var person = Person(id = 1, name = "Subramanian", city = "Coimbatore")
    println("Without Destructuring")
    println("id ${person.id} Name ${person.name} City ${person.city}")

    println("Destructuring")
    var (id, name, city) = person
    println("id ${id} Name ${name} City ${city}")

}