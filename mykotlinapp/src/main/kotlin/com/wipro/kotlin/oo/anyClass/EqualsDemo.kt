package com.wipro.kotlin.oo.anyClass

class Square(val side: Int) {
    override fun equals(other: Any?): Boolean {
        //is eq instanceof
        if (other is Square) {
            return other.side == side

        }
        return false
    }
}

fun main() {
    var square1 = Square(10)
    var square2 = Square(10)
    var isEqual = square1.equals(square2)
    println(isEqual)

    //== compares properties of object
    var isEqual1 = square1 == square2
    println(isEqual1)

    // using === operator compares the location of object
    var isEqual2 = square1 === square2
    println(isEqual2)

    var tmpSquare = square1
    println(tmpSquare === square1)

}