package com.wipro.kotlin.basics.conditionalexpression

fun main() {
    var input = 120
    when (input) {
        in 1..107 -> println("Input is part of this range  1- 100")
        !in 1..100 -> println("Input does not part of this range")
    }
}