package com.wipro.kotlin.oo.innerclasses

class Counter {
    init {
        println("outter class")
    }

    //inner class
    class Increment {
        init {
            println("Inner class")
        }
        fun incrementValue(){
            println("increment value")
        }
    }

    fun createInner() {
        val inc = Increment()
    }
}

fun main() {
    //using outter class method
    val counter = Counter()
    counter.createInner()
    //using outter class
    val inner = Counter.Increment()
    inner.incrementValue()
}