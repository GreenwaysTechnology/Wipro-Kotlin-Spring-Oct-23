package com.wipro.kotlin.functions.normal.returntypes

//fun sum(a: Int = 0, b: Int = 0): Int {
//    return a * b
//}
//Single expression function
//fun sum(a: Int = 0, b: Int = 0): Int = a * b
//return type also can be ommitted
fun sum(a: Int = 0, b: Int = 0) = a * b
fun accept(name: String = "name") = "Hello $name"

fun main() {
    println(sum(123, 45)) //position
    println(sum(b = 90, a = 10)) //Named parameter
    println(accept("Subramanian"))
}