package org.example.lesson_3

fun main() {
    val strokeDetails = "D2-D4;0"
    val whereFrom = strokeDetails.substring(0,2)
    val where = strokeDetails.substring(3,5)
    val moveNumber = strokeDetails[6]

    print(whereFrom + "\n" + where + "\n" + moveNumber)
}
