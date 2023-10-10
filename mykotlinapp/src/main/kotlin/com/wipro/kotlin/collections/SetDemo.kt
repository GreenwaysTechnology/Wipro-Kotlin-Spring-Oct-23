package com.wipro.kotlin.collections

fun main() {
    mutableSetOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).apply {
        add(12)
        add(1)
        add(3)
        add(4)
    }.let {
        it.forEach(::println)
    }
}