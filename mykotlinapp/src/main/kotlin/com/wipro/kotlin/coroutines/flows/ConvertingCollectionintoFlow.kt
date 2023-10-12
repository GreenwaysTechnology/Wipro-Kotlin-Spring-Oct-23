package com.wipro.kotlin.coroutines.flows

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        listOf<Int>(1, 2, 3, 4, 5).asFlow().map { it * 2 }.collect {
            println("$it")
        }
    }

}