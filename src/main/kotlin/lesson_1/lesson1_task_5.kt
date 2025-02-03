package org.example.lesson_1

const val constantTime = 60

fun main(){
    var secondInSpace: Int = 6480
    val hourInSpace = secondInSpace / constantTime / constantTime

    val minuteInSpace = secondInSpace / constantTime - (constantTime * hourInSpace)
    secondInSpace -= ((constantTime * hourInSpace + minuteInSpace) * constantTime)

    val timeFormat = String.format("0%d:%d:%d0", hourInSpace, minuteInSpace, secondInSpace)

    print(timeFormat)
}