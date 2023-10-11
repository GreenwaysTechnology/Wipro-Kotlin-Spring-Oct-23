package com.wipro.kotlin.coroutines.builders

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val res: Deferred<String> = async {
            println("Hello async")
            delay(5000L)
            //Return value: value type can be anything
            "Hello,How are you, i am from Future"
        }
        res.join()
        println("Value ${res.await()}")
    }
}