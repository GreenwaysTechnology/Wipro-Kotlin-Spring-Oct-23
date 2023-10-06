package com.wipro.kotlin.oo.classes.inlinefunc

inline fun filter(condition: Boolean): Boolean {
    return condition
}

fun main() {
    //call inline function
    for (count in 1..100) {
        println(filter(true))
    }
}