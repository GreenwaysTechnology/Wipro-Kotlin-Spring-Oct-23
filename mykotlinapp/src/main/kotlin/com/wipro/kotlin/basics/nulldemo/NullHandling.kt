package com.wipro.kotlin.basics.nulldemo

fun main() {
    var name: String? = null
    //Ways to handle null
    //Way 1: Handling null using java style
    if (name != null) {
        println(name.length)
    }

    //Way 2: Kotlin style "Using safe navigation operator
    println(name?.length)

    //Way 3: Kotlin style "Using Elvis Operator" : if there is null,if you want some default
    // instead of "null" string.
   // name="subramanian"
    var length = name?.length ?: 0
    println("String length is $length")

    //way 4: kotlin style: for some reasons,"if you want Runtime Exception" How to throw NullPointerException
    //!! assertion operator which throws runtime exception.
    println("${name!!.length}")
}