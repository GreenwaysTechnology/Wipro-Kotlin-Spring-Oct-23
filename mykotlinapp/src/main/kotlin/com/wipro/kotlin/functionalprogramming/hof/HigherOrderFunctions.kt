package com.wipro.kotlin.functionalprogramming.hof

//Basic higher order function
fun sayGreet(action: () -> Unit) {
    action.invoke()
    action()
}

//


fun main() {
    //passing functions pattern
    var hello = fun() {
        println("Hello")
    }
    //passing function via variable
    sayGreet(hello)
    //passing function as literal to the function
    sayGreet(fun() {
        println("Hello")
    })

}