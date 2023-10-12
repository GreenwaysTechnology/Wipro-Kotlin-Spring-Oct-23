package com.wipro.kotlin.coroutines.flows

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

fun doSomething(): Flow<Int> = flow {
    for (i in 1..10) {
        delay(100)
        println(Thread.currentThread().name)
        emit(i)
    }
}

fun main() {
    runBlocking {
        withTimeoutOrNull(200) {
            doSomething().collect { value -> println("Got $value") }

        }
    }
}