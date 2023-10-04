package com.wipro.kotlin.functions.normal

//other functions

//fun declaration
fun sayHello() {
    //function body
    println("Hello");
}

//fun with some logic
fun add() {
    var a = 10
    var b = 20
    var c = a + b
    println("Add Result $c")

}

//Every Kotlin has entry point called main function
fun main() {
    //invoke function
    sayHello();
    add();
}