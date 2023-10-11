package com.wipro.kotlin.coroutines.builders

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    var job: Job = launch {
        delay(1000L)
        println("world!")
    }
    println("Hello")
    job.join();
    println("done")

}