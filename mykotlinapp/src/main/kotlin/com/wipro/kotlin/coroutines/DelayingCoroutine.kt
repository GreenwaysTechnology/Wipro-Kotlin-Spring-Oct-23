package com.wipro.kotlin.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun timer() {
    //Thread.sleep(2000)
    delay(2000)
    println("Hello")
}


fun main() {

    GlobalScope.launch {
        timer();
    }
    println("world")
    Thread.sleep(5000)
}