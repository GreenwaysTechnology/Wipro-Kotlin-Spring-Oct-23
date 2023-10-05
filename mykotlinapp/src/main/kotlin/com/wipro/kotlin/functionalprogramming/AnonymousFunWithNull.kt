package com.wipro.kotlin.functionalprogramming

//var accept: (String?) -> String? = fun(message: String?): String? {
//    return message
//}
//var accept = fun(message: String?): String? {
//    return message
//}
var accept: ((String) -> String)? = fun(message: String): String {
    return "Hello $message"
}
var display = fun(message: String?): String? {
    return "Hello $message"
}

fun main() {
    //println(accept("Hello"));
    accept?.invoke("Hello")
    display?.invoke("Hello");
    display?.invoke(null)
}