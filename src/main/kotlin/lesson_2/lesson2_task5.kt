package org.example.lesson_2

import kotlin.math.pow

const val FULL_PERCENTAGE = 100

fun main() {
    val startingAmount = 70000
    val interestRare = 16.7
    val period = 20.0

    val amountOfYear = (1 + interestRare / FULL_PERCENTAGE)

    var finishAmount = amountOfYear.pow(period)

    finishAmount *= startingAmount

    print(String.format("%.3f", finishAmount))
}