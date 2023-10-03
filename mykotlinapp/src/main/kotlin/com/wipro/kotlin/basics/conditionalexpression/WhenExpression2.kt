package com.wipro.kotlin.basics.conditionalexpression


fun main() {
    //simple when
    var x = 10
    when (x) {
        0, 10 -> println("X value is 0 or 10")
        else -> println("No match found")
    }
}