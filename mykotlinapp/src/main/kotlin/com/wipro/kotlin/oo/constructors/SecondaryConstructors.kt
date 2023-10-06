package com.wipro.kotlin.oo.constructors

class MyClass constructor() {
    //secondary constructors
    constructor(a: String) : this() {
        println("Constructor with String arg")
    }

    constructor(a: Int) : this() {
        println("Constructor with Int arg")
    }

    constructor(a: Double) : this() {
        println("Constructor with Double arg")
    }
}

class Employee constructor(var name: String = "", var salary: Double = 0.0) {
    constructor(name: String) : this(name, 10.1) {
        println("Constructor with String arg")
    }
}

fun main() {
    MyClass("hello")
    MyClass(20)
    MyClass(34.44)
    var emp = Employee("Test", 22.333)
    println(emp.name)
    println(emp.salary)
}