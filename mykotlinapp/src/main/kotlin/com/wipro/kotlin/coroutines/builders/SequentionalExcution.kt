package com.wipro.kotlin.coroutines.builders

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime


suspend fun getvalueOne(): Int {
    delay(1000L)
    return 10
}

suspend fun getvalueTwo(): Int {
    delay(1000L)
    return 122
}

@OptIn(ExperimentalTime::class)
fun main() {
    runBlocking {
        var time = measureTime {
            var task1 = getvalueOne()
            var task2 = getvalueTwo()
            println("The Result is ${task1 + task2}")
        }
        println("Time taken for all tasks is $time")
    }
}