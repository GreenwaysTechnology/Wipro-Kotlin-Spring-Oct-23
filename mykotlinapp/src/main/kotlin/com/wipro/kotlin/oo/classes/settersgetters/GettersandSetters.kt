package com.wipro.kotlin.oo.classes.settersgetters

class User {
    var name: String? = null
        set(value) {
            field = "Mr/Mrs $value"
        }
        get() = field?.uppercase()

}

fun main() {
    val user = User()
    user.name = "Subramanian"
    println(user.name)
}