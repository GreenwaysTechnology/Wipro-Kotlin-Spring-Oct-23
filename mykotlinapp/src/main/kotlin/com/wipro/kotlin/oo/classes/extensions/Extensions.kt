package com.wipro.kotlin.oo.classes.extensions


class Util {
    fun sayHello(): String {
        return "Hello"
    }
}

//extensions:
fun Util.sayHai(): String {
    return "Hai"
}

//extensions with string
fun String.add(name: String): String {
    //kotlin provides this keyword to access receiver type
    return this + name
}

fun Int.myadd(no1: Int): Int {
    return this.plus(no1)
}

//Extension Properties
val Util.greetings: String
    get() = "Extension property"

val String.city: String
    get() = "Coimbatore"

fun main() {
    var util = Util()
    println(util.sayHello())
    println(util.sayHai())
    var str: String = "Hello";
    var name = "Subramanian"
    //str is receiver type
    println(str.add(name));
    var number = 100
    println(number.myadd(22))

    var n = 10
    println(n.plus(12))

    //Extension property access
    println("".city)
    println(util.greetings)
}