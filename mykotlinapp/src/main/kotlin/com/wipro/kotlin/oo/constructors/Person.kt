package com.wipro.kotlin.oo.constructors

//class Person constructor(var firstName: String = "", var lastName: String = "", var age: Int = 0) {
//
//}
//class Person(var firstName: String = "", var lastName: String = "", var age: Int = 0) {
//
//}
//without {}
class Person(var firstName: String = "", var lastName: String = "", var age: Int = 0)

fun main() {
    var person = Person();
    println("Name ${person.firstName} ${person.lastName}")
    println("Age ${person.age}")
    person = Person(firstName = "Subramanian", lastName = "Murugan", age = 18)
    println("Name ${person.firstName} ${person.lastName}")
    println("Age ${person.age}")
    person = Person(firstName = "Subramanian", lastName = "Murugan")
    println("Name ${person.firstName} ${person.lastName}")
    println("Age ${person.age}")
}