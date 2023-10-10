package com.wipro.kotlin.oo.scopefunctions.runfun

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
    User(name = "Subramanian", location = "Coimbatore", points = 10).run {
//        println("Name ${this.name}")
//        println("Location ${this.location}")
//        println("Points ${this.points}")
                //in side run this keyword is implicit
        println("Name ${name}")
        println("Location ${location}")
        println("Points ${points}")
        //return
        this
    } .run {
        updateLocation("New Delhi")
        this
    } .run {
        incrementPoints()
        this
    } .run {
        println("Name ${name}")
        println("Location ${location}")
        println("Points ${points}")
    }

}