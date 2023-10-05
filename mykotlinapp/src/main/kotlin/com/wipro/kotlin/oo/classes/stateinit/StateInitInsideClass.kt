package com.wipro.kotlin.oo.classes.stateinit


class Customer {
    //instance variables
    var id: Int? = 0
    var firstName: String? = "Subramanian"
    var lastName: String? = "Murugan"
    var status: Boolean? = true

}

fun main() {
    //customer is reference variable
    //val customer: Customer = Customer()
    val customer = Customer()
    customer.id = 1
    customer.firstName = "Geetha"
    customer.lastName = "Subramanian"
    customer.status = true
    println("Id ${customer.id}")
    println("Name ${customer.firstName} ${customer.lastName}")
    println("Status ${customer.status}")

}