package com.wipro.kotlin.oo.classes.infixnotation

class Greeter {
    infix fun sayHello(name: String) {
        println("$this $name")
    }
}
infix fun Greeter.sayHai(name:String) {
    println("$this $name")

}

fun main() {
    var greeter = Greeter()
    greeter.sayHello("Hello")
    greeter sayHello "Hello"
    greeter sayHai "hai"
}