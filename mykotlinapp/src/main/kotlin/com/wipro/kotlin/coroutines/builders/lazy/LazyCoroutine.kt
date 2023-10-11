package com.wipro.kotlin.coroutines.builders.lazy

import kotlinx.coroutines.*
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
            var task1 = async(start = CoroutineStart.LAZY) { getValOne() }
            var task2 = async(start = CoroutineStart.LAZY) { getValTwo() }
            launch {
                delay(5000L)
                task1.start()
                task2.start()
                println("The Result is ${task1.await() + task2.await()}")
            }
        }
        println("Time taken for all tasks is $time")
    }
}