package com.wipro.kotlin.functions.normal.args.defaultargs

//Any is like  java.lang.Object in java.
//In Kotlin every thing Object, Super Object is "Any"
fun accept(a: Any) {
    println(a)
}

fun main() {
    accept("hello")
    accept(100)
    accept(true)
    accept(33.44)
}