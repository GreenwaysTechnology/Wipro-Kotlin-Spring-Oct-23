package com.wipro.kotlin.oo.innerclasses

class Employee {
    var person = object {
        var id = 1
        var firstName = "Subramnaian"
    }

}

//static variables
object Message {
    var Warning = "Warning"
}


fun main() {
    var Person = object {
        var id = 1
        var firstName = "Subramnaian"
    }
    println(Person.id)
    println(Person.firstName)
    var emp = Employee()
    println(Message.Warning)
}