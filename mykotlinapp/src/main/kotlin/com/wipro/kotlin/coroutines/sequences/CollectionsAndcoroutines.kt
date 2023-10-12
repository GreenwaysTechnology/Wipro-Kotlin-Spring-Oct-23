package com.wipro.kotlin.coroutines.sequences

import kotlinx.coroutines.delay

fun simple(): List<Int> = listOf(1, 2, 3, 4)

//
fun asyncList(): Sequence<Int> = sequence {
    for (i in listOf<Int>(1, 2, 3, 4)) {
        Thread.sleep(500)
        //return sequence of values
        yield(i)
    }
}

fun main() {
    //simple().forEach { value -> println(value) }
    asyncList().forEach { value -> println(value) }
}