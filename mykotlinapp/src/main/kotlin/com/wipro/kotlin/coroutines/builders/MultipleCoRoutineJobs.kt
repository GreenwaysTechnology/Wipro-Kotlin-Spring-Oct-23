package com.wipro.kotlin.coroutines.builders

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        var job1 = GlobalScope.launch {
            println("Job1 Thread : ${Thread.currentThread().name}")
        }
        job1.join()
        var job2 = GlobalScope.launch {
            println("Job2 Thread : ${Thread.currentThread().name}")

        }
        job2.join()
        var job3 = GlobalScope.launch {
            println("Job3 Thread : ${Thread.currentThread().name}")
        }
        job3.join()
    }
}