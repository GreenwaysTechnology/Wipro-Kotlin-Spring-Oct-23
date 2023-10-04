package com.wipro.kotlin.functions.normal.args.defaultargs

fun add(a: Int = 0, b: Int = 0) {
    var c = a + b
    println("a $a b $b c $c")
}

fun main() {
    add()
    add(10,20)
}