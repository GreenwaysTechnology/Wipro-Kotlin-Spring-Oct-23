package com.wipro.kotlin.functionalprogramming.dsl

import kotlin.concurrent.thread

fun compute(no: Int = 0, action: () -> Unit) {
    println("No $no")
    action()
}

fun filterBy(
    order: String = "asc",
    name: String = "name",
    no: Int = 0,
    action: () -> Unit
) {
    println("Order $order Name $name No $no")
    action()
}

fun main() {
    compute(10, { println("compute") })
    //dsl syntax
    compute(23) { println("compute") }
    //dsl syntax with default value
    compute { println("compute") }

    filterBy { println("Filter callback") }
    filterBy(name = "Subramanian", order = "asy", no = 1) {
        println("Filter callback with values")
    }
    //Thread creation using lambda
    thread(start = true, name = "MyThread1", priority = 2) {
        Thread.sleep(2333)

        println("${Thread.currentThread().name}")
    }

    thread(start = true, name = "MyThread2", priority = 1) {
        println("${Thread.currentThread().name}")
    }

    thread(start = true, name = "MyThread3", priority = 2) {
        println("${Thread.currentThread().name}")
    }
}