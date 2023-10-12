package com.wipro.kotlin.coroutines.channels

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    GlobalScope.launch {
        //create a channel
        val channel = Channel<Int>()
        //send data async in coroutine
        launch(Dispatchers.Default) {
            //publish data inside one coroutine
            println("Publishing in ${Thread.currentThread().name}")
            for (i in 10 downTo 0) channel.send(i)
        }

        //Receiving
        launch(Dispatchers.IO) {
            println("Receiving from ${Thread.currentThread().name}")
            for (j in channel) println("downloading $j")
        }
    }
    Thread.sleep(10000L)
}