package com.wipro.kotlin.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//simple suspend function
suspend fun sayHello() {
    println("Hello is running in ${Thread.currentThread().name}")
}


//fun main() {
//    println("main starts")
//    val scope = GlobalScope
//    scope.launch {
//        sayHello()
//    }
//
//    //pause the main thread for some time
//    Thread.sleep(5000)
//}

fun main() {
    GlobalScope.launch {
        sayHello()
    }
    Thread.sleep(5000)

}
//
//fun main() = runBlocking {
//    launch {
//        sayHello()
//    }
//    println("main")
//}