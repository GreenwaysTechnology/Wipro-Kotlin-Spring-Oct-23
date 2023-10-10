package com.wipro.kotlin.oo.scopefunctions.withfun


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
    //note: with can't be chained
    with(User(name = "Subramanian", location = "Coimbatore", points = 10)) {
//        println("Name ${this.name}")
//        println("Location ${this.location}")
//        println("Points ${this.points}")
        println("Name ${name}")
        println("Location ${location}")
        println("Points ${points}")
        this
    }.run {
        updateLocation("Chennai")
        this
    }.run {
        incrementPoints()
        this
    }.run {
        println("Name ${name}")
        println("Location ${location}")
        println("Points ${points}")
    }

}