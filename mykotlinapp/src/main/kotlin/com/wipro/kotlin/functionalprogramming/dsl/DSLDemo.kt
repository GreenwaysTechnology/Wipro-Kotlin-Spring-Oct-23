package com.wipro.kotlin.functionalprogramming.dsl

fun delay(action: () -> Unit) {
    action()
}

fun repositories(action: () -> Unit) {
    action()
}

fun mavenCentral() {
    println("downloading jar dependencies")
}

fun main() {
    var task = {
        println("task-lambda")
    }
    // normal syntax
    delay(task)
    delay({
        println("Delay lambda ")
    })
    //dsl syntax
    delay(task) // when you pass variable, you can ommit braces
    delay {
        println("Delay lambda ")
    }
    repositories {
        mavenCentral()
    }
}