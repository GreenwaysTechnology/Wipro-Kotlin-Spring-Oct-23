package com.wipro.kotlin.coroutines.flows

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun getAsynValue(): Flow<Int> = flow {
    for (i in 1..10) {
        delay(100)
        println(Thread.currentThread().name)
        emit(i)
    }
}

fun main() {
    runBlocking(Dispatchers.IO) {
        launch {
            //collect values
            getAsynValue().collect { value -> println("Got $value") }
        }
    }
}