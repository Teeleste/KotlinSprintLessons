package org.example.lesson_2

const val FULL_PERCENT = 100
fun main() {
    val startingAmount = 70000
    val interestRare = 16.7
    val period = 20
    var finishAmount = 1.0

    val amountOfYear = (1 + interestRare / FULL_PERCENT)

    for (i in 1..period) {
        finishAmount *= amountOfYear
        println(finishAmount)
        println(i)
    }

    finishAmount *= startingAmount

    print(String.format("%.3f", finishAmount))
}