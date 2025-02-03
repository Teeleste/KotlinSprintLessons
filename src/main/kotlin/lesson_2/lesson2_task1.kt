package org.example.lesson_2

fun main() {

    val scoreFirstStudent: Float = 3.0f
    val scoreSecondStudent: Float = 4.0f
    val scoreThirstStudent: Float = 3.0f
    val scoreFourthStudent: Float = 5.0f
    val numberOfStudents = 4
    val arithmeticMean = (scoreFirstStudent + scoreSecondStudent + scoreThirstStudent + scoreFourthStudent) / numberOfStudents

    println(arithmeticMean)
}