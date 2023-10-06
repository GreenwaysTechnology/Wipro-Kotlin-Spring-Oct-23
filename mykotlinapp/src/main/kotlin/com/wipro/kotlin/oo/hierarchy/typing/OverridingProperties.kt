package com.wipro.kotlin.oo.hierarchy.typing

open class Shape {
    open val x: Int = 0
}

class Square : Shape() {
    override val x: Int = 100
}

fun main() {
    val shape = Square()
    println(shape.x)
}