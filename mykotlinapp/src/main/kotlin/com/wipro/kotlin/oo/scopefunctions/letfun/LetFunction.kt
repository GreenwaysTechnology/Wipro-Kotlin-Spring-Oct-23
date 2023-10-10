package com.wipro.kotlin.oo.scopefunctions.letfun

data class User(var name: String = "", var location: String = "", var points: Int = 0) {
    //biz logic
    fun updateLocation(newLocation: String) {
        location = newLocation
    }

    fun incrementPoints() {
        points++
    }
}

fun main() {
    User(name = "Subramanian", location = "Coimbatore", points = 10).let {
        println("Name ${it.name}")
        println("Location ${it.location}")
        println("Points ${it.points}")
        //return object reference
        it
    }.let {
        it.updateLocation("new Delhi")
        it
    }.let {
        it.incrementPoints()
        it
    }.let {
        println("Location ${it.location}")
        println("Points ${it.points}")
    }

}