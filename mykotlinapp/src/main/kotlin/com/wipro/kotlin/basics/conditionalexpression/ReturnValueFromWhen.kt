package com.wipro.kotlin.basics.conditionalexpression

fun main() {
    var isLoggedIn = false
    var status = when (isLoggedIn) {
        true -> "LoggedIn"
        false -> "LoggedOut"
    }
    println(status)
}