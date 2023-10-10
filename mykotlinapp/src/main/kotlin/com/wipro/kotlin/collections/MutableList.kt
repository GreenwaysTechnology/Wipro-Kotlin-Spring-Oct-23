package com.wipro.kotlin.collections

fun main() {
    var list = mutableListOf<Int>(1, 2, 4)
    list.forEach(::println)
    list.add(12)
    list.add(233)
    list.forEach(::println)
    //scope functions
    mutableListOf<Int>(1, 2, 4).apply {
        add(13)
        add(333)
        add(20)
    }.apply {
        sortByDescending { it }
    }.let {
        println("After sorting")
        it.forEach(::println)
    }

}