package com.wipro.kotlin.collections

fun transformation() {
    //readable
    listOf<Int>(1, 2, 3, 4, 5).let {
        it.forEach(::println)
        it
    }.let {
        //double it
        it.map { i -> i * 2 }.forEach(::println)
    }
}

fun main() {
    transformation()
}