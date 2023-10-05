package com.wipro.kotlin.oo.classes

class Customer {
    //instance variables
    var id: Int? = null
    var firstName: String? = null
    var lastName: String? = null
    var status: Boolean? = null

}

fun main() {
    //customer is reference variable
    //val customer: Customer = Customer()
    val customer = Customer()
    //no need of adding getters and setters ; kotlin provides default getters and setters
    println("Id ${customer.id}")
    println("Name ${customer.firstName} ${customer.lastName}")
    println("Status ${customer.status}")

}