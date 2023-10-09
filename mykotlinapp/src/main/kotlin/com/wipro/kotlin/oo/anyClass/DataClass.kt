package com.wipro.kotlin.oo.anyClass

data class User(val name: String, val age: Int)

fun main() {
    var user = User("Subramanian", 18)
    println(user.toString())
    println(user.hashCode())
    //clonning api
    val newUser = user.copy(age = 43)
    println(newUser)
}