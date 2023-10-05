package com.wipro.kotlin.functionalprogramming

//With type
//var add: (Int, Int) -> Int = fun(a: Int, b: Int): Int {
//    return a + b
//}
//without Type
//var add = fun(a: Int, b: Int):Int {
//    return a + b
//}
//Single function expression with anonymous function
var add = fun(a: Int, b: Int) = a + b

fun main() {
    println(add(10, 3));
}