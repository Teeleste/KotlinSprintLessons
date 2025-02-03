package org.example.lesson_2

fun main() {
    val startingAmount = 70000
    val percent = 16.7
    val period = 20.0

    val finisAmount = startingAmount*(Math.pow((1+percent/100), period))
    print(String.format("%.3f", finisAmount))
}