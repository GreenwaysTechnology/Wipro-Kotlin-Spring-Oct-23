package com.wipro.kotlin.functionalprogramming.hof

fun login(
    userName: String = "foo",
    password: String = "bar",
    resolve: (String) -> Unit,
    reject: (String) -> Unit
) {

    if (userName == "admin" && password == "admin")
        resolve("Login Success")
    else
        reject("Login failed")

}

fun main() {
    login(userName = "admin",
        password = "admin",
        fun(status) { println(status) },
        fun(err) {
            println(err)
        })
    login(userName = "foo",
        password = "bar",
        fun(status) { println(status) },
        fun(err) {
            println(err)
        })
}