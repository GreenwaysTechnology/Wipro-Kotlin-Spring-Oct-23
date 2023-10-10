package com.wipro.kotlin.oo.scopefunctions.alsofun


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
    User(name = "Subramanian", location = "Coimbatore", points = 10).also {
        println("Name ${it.name}")
        println("Location ${it.location}")
        println("Points ${it.points}")
        //dont need to return it keyword
    }.also {
        it.updateLocation("Chennai")
    }.also {
        it.incrementPoints()
    }.also {
        println("Name ${it.name}")
        println("Location ${it.location}")
        println("Points ${it.points}")
    }

    //mix:
    with("subramanian".run {
        uppercase()
        trim()
        this
    }) {
        println(length)
    }

}



