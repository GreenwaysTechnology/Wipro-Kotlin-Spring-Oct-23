package com.wipro.kotlin.functionalprogramming.lambdas

//var login: (String, String) -> String = { userName: String, password: String ->
//    if (userName == "admin" && password == "admin")
//        "Login Success"
//    else
//        "Login Failed"
//}
var login = { userName: String, password: String ->
    if (userName == "admin" && password == "admin")
        "Login Success"
    else
        "Login Failed"
}

fun main() {
    println(login("admin", "admin"))
}