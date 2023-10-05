package com.wipro.kotlin.functionalprogramming.dsl

fun doCompute(a: Int = 0, b: Int = 0, action: (Int, Int) -> Unit) {
    action(a, b)
}

fun main() {
    doCompute(b = 233) { _, b -> println(b) }
}