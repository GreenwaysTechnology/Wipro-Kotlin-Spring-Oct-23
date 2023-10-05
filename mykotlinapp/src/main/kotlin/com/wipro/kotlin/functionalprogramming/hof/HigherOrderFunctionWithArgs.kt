package com.wipro.kotlin.functionalprogramming.hof

fun adder(action: (Int, Int) -> Unit) {
    action(10, 10)
}

fun main() {
    adder(fun(a: Int, b: Int) {
        var c = a + b
        println("C $c")
    })
}