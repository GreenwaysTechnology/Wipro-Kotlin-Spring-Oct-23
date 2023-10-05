package com.wipro.kotlin.functionalprogramming.lambdas

//var sayMyName = { name: String ->
//    name.uppercase()
//}
//using it variable
var sayMyName: (String) -> String = {
    println("test")
    println("demo")
    it.uppercase()
}

fun main() {
    println(sayMyName("Subramanian"))
}