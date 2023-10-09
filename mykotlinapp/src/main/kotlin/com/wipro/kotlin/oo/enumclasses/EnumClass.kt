package com.wipro.kotlin.oo.enumclasses

enum class Color {
    RED, BLUE, GREEN, YELLOW
}

enum class Day(val day: Int) {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7)

}

fun main() {
    println(Color.GREEN)
    println(Day.MONDAY.day)
}