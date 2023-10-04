package com.wipro.kotlin.functions.normal.args

fun sayHello(message: String) {
    println(message)
}
fun add(a:Int,b:Int){
    var c = a + b
    println("C $c")
}

fun main() {
    sayHello("Hello")
    add(10,10)
}