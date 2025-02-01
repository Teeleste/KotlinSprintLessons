package org.example.lesson_1

fun main(){
    var secondInSpace: Int = 6480
    val hourInSpace = secondInSpace / 60 / 60
    val minuteInSpace = secondInSpace / 60 - (60 * hourInSpace)
    secondInSpace -= ((60 * hourInSpace + minuteInSpace) * 60)

    print("0" + hourInSpace + ":" + minuteInSpace + ":" + "0" + secondInSpace)
}