package com.wipro.kotlin.coroutines.builders

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.withTimeoutOrNull

fun main() {
    runBlocking {
       var result = withTimeoutOrNull(1500L) {
            repeat(1000){
                println("job : I am sleeping $it")
                delay(500)
            }
        }
        println("$result")
    }
}