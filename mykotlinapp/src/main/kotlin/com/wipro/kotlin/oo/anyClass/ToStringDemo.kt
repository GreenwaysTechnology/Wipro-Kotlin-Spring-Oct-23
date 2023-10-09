package com.wipro.kotlin.oo.anyClass

class Sample {
    override fun toString(): String {
        return "Sample"
    }

    override fun hashCode(): Int {
        return 334343
    }
}

fun main() {
    var sample = Sample()
    println(sample.toString())
    println(sample.hashCode())
}