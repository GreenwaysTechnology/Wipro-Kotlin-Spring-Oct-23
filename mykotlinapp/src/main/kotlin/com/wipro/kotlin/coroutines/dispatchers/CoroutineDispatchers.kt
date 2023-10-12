package com.wipro.kotlin.coroutines.dispatchers

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch {
            println("main run Blocking : i am working in thread ${Thread.currentThread().name}")
        }
        launch(Dispatchers.Default) {
            println("Default  : i am working in thread ${Thread.currentThread().name}")
        }
        launch(Dispatchers.IO) {
            //networking code, database logic
            println("IO  : i am working in thread ${Thread.currentThread().name}")

        }

    }
}