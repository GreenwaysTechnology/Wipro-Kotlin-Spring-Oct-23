package com.wipro.kotlin.coroutines.builders

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime


suspend fun getValOne(): Int {
    delay(1000L)
    return 10
}

suspend fun getValTwo(): Int {
    delay(1000L)
    return 122
}

@OptIn(ExperimentalTime::class)
fun main() {
    runBlocking {
        var time = measureTime {
            var task1 = async { getvalueOne() }
            var task2 = async { getvalueTwo() }
            println("The Result is ${task1.await() + task2.await()}")
        }
        println("Time taken for all tasks is $time")
    }
}