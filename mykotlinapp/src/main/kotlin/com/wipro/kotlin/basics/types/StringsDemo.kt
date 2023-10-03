package com.wipro.kotlin.basics.types

fun main() {
    var firstName: String = "Subrmanaian"
    var lastName = "Murugan"
    //java style:it is not recommended
    println("Name" + firstName + lastName)
    //kotlin style: using string interpolation
    println("Name $firstName $lastName")

}