package com.wipro.kotlin.coroutines.builders

import kotlinx.coroutines.*


fun main() {

    runBlocking {
        var job1 = GlobalScope.launch {
            repeat(1000) {
                println("job : I am sleeping $it")
                delay(500L)
            }
        }
        delay(1300L)
        println("Main : i m tired of waiting!")
//        job1.cancel()
//        job1.join()
        job1.cancelAndJoin()
        println("main: now i can be happy, good bye")
    }
}