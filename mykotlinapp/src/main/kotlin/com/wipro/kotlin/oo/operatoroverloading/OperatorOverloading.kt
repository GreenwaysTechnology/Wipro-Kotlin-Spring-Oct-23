package com.wipro.kotlin.oo.operatoroverloading

class Person {
    var skills: String? = null
    fun show() = skills
}

//operator function
operator infix fun Person.plus(person: Person): Person {
    var newPerson = Person()
    newPerson.skills = this.skills + person.skills
    return newPerson
}

fun main() {
    var person1 = Person()
    person1.skills = "Kotlin"

    var person2 = Person()
    person2.skills = "Spring boot"
    //coimbine or add
    person1.plus(person2).apply {
        println(show())
    }
    //built in operators have been overloaded.
    var a = 10
    print(a.plus(23))

}