package org.example.lesson_5

const val AGE_OF_MAJORITY = 18

fun main(){

    val yearOfBirthday = readln().toInt()
    val thisYear = 2025

    if((thisYear - yearOfBirthday) >= AGE_OF_MAJORITY){
        print("Show special content")
    } else {
        print("Back to main screen")
    }


}