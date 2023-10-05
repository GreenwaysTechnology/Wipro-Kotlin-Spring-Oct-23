package com.wipro.kotlin.functionalprogramming.lambdas

fun delay(action: () -> Unit) {
    action()
}

//Inside lambda, it variable is not available when function passed as parameter or function as type
//var async1:() -> Unit = {
//    it()
//}

var async = { action: () -> Unit ->
    action()
}


fun main() {
//passing regular function as parameter
    delay(fun() {
        println("delay")
    })
    //passing lambda
    var task = {
        println("task-lambda")
    }
    delay(task)
    delay({
        println("task-lambda")
    })
    async(task)
    async({
        println("lambda task 1")
    })
    async(fun() {
        println("delay")
    })
}