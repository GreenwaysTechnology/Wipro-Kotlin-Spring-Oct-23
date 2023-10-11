package com.wipro.kotlin.coroutines.builders

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

//Thread code
fun main() {
    //we should wrap this code with context of coroutine
//    repeat(1000000) {
//        thread(name="mythread") {
//            Thread.sleep(500)
//            print("*\n")
//        }
//    }

    //cpu intensive task must be executed with in coroutine
    runBlocking {
        repeat(100000) {
            var job = GlobalScope.launch {
                delay(100)
                println("*")
            }
            job.join()
        }
    }
}