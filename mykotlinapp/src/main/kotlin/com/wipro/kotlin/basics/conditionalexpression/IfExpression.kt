package com.wipro.kotlin.basics.conditionalexpression

fun main() {
    var a = 100
    var b = 2088
    var max = a
    //traditional style: java style
    if (a < b) {
        max = b
    }
    println("Max $max ")
    //Kotlin expression style
    if (a < b) max = b //here we return max variable
    println("Max $max ")

    //if..else ; java style
    if (a > b) {
        max = a
    } else {
        max = b
    }
    println("Max $max ")
    //if..else ; kotlin style

    max = if (a > b) a else b
    println("Max $max ")

    var isValid = true
    var res = if (isValid) "Greet" else "Good Bye"
    println(res)
    //block of code with if and else
    res = if (isValid) {
        println("More code")
        var firstName = "Subramnaian"
        //return value
        "Hello $firstName"
    } else {
        println("More code")
        var firstName = "Murugan"
        //return value
        "How are you? Mr/Mrs $firstName"
    }
    println(res)


}