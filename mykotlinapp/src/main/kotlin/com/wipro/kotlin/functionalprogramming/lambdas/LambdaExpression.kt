package com.wipro.kotlin.functionalprogramming.lambdas

//normal function
fun add(a: Int = 1, b: Int = 1): Int {
    return a + b
}

//Single expression function
fun addExression(a: Int = 1, b: Int = 1) = a + b

//function as literal : default values can't be initialized in the function literal
var addFunLiteral = fun(a: Int, b: Int): Int {
    return a + b
}

//function  lambda
val addLambda = { a: Int, b: Int ->
    //body of the function
    //last line of the function to be treated as return value
    a + b
}

fun main() {
    println(add())
    println(addExression())
    println(addFunLiteral(33, 333))
    println(addLambda(1, 2))
}