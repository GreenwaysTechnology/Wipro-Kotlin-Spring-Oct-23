package com.wipro.kotlin.basics.operators

fun main() {
    var a = 10;
    var b = 22;
    var c = a + b
    println("Add $c")
    c = a - b
    println("Substraction $c")
    c = a * b
    println("Multiplication $c")
    c = a / b
    println("Division $c")
    c = a % b
    println("Moduls $c")
    //augmentd operators
    var counter = 0
    counter += 1
    println("counter $counter")

    //logical operators : based on boolean expressions
    var isValid = true
    var isEnabled = false
    var res = isValid && isEnabled
    println("Result $res")

    //Equals : Structural equals
    var x = 100
    var y = 100
    var isEqual = x == y
    println("X AND  Y ARE Equal $isEqual")
    var str = "hello"
    var str1 = str
    println("str AND  str1 ARE Equal ${str1 == str}")

    //comparasional operators
    var isBig  = a > b
    println("IsBIg $isBig")

}