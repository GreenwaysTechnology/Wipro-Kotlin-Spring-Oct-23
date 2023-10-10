package com.wipro.kotlin.oo.generics

class Box<T>(t: T) {
    var value = t
}

fun main() {
    var box1: Box<Int> = Box(10)
   // var box2: Box<Int> = Box("test")
}