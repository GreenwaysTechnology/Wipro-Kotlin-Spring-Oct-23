package com.wipro.kotlin.collections

fun main() {
    var myIntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(myIntArray.get(0))
    myIntArray.forEach { println(it) }
    val courses = arrayOf("Kotlin", "Java", "Scala", "Groovy")
    courses.iterator().forEach { println(it) }
}