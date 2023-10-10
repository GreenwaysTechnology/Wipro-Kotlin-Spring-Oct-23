package com.wipro.kotlin.collections

fun main() {
    mutableMapOf<String, Int>("value1" to 100, "value 2" to 200).apply {
        values.forEach(::println)
        keys.forEach(::println)
    }
}