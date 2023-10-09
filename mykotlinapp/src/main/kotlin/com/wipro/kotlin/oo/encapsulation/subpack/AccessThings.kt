package com.wipro.kotlin.oo.encapsulation.subpack

import com.wipro.kotlin.oo.encapsulation.Animal
import com.wipro.kotlin.oo.encapsulation.Hello
import com.wipro.kotlin.oo.encapsulation.MyLib
import com.wipro.kotlin.oo.encapsulation.getVersion

//import com.wipro.kotlin.oo.encapsulation.User

class Dog : Animal() {
    //public is explicitly needed ; by default protected methods are private
    public override fun eat() {
        println("Dog eats")
    }

}

fun main() {
    var hello = Hello()
//    var user = User ()
    var mydog = Dog()
    mydog.eat()

    var mylib = MyLib()
    getVersion()
}