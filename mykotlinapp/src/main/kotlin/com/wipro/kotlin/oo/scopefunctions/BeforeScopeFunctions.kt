package com.wipro.kotlin.oo.scopefunctions

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
    var user = User(name = "Subramanian", location = "Coimbatore", points = 10)
    //access properties
    println("Name ${user.name}")
    println("Location ${user.location}")
    println("Points ${user.points}")

    //update location and points
    user.updateLocation("Chennai")
    user.incrementPoints()
    println("Location ${user.location}")
    println("Points ${user.points}")




}