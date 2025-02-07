package org.example.lesson_3

fun main() {
    val strokeDetails = "D2-D4;0"
    val (whereFrom, where, moveNumber) = strokeDetails.split("-", ";")

    print(whereFrom + "\n" + where + "\n" + moveNumber)
}
