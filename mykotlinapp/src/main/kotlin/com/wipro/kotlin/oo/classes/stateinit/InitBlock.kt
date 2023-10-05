package com.wipro.kotlin.oo.classes.stateinit


class Employee {
    //instance variables
    var id: Int? = null
    var firstName: String? = null
    var lastName: String? = null
    var status: Boolean? = null

    init {
        id = 1
        firstName = "foo"
        lastName = "bar"
        status = false
    }
    init {
        println("init 2")
    }
}

fun main() {
    //customer is reference variable
    //val customer: Customer = Customer()
    val employee = Employee()

    println("Id ${employee.id}")
    println("Name ${employee.firstName} ${employee.lastName}")
    println("Status ${employee.status}")

}