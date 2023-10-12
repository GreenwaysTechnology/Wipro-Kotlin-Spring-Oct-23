package com.wipro.kotlin.coroutines.flows

import kotlinx.coroutines.runBlocking

//Blocking sequence
//fun getValues(): Sequence<Int> = sequence {
//    for (i in 1..10) {
//        Thread.sleep(100)
//        yield(i)
//    }
//}

suspend fun getValues(): List<Int> = listOf(1, 2, 3)
fun main() {
    runBlocking {
        getValues().forEach(::println)
    }
}