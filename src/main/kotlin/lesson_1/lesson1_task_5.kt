package org.example.lesson_1

const val CONSTANT_TIME = 60

fun main(){
    var secondInSpace: Int = 6480
    val hourInSpace = secondInSpace / CONSTANT_TIME / CONSTANT_TIME

    val minuteInSpace = secondInSpace / CONSTANT_TIME - (CONSTANT_TIME * hourInSpace)
    secondInSpace -= ((CONSTANT_TIME * hourInSpace + minuteInSpace) * CONSTANT_TIME)

    val timeFormat = String.format("0%d:%d:%d0", hourInSpace, minuteInSpace, secondInSpace)

    print(timeFormat)
}