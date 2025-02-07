package org.example.lesson_4

fun main() {

    val weather: Boolean = true
    val awning: Boolean = true
    val humidity = 20
    val season = "зима"

    print("Благоприятные ли условия сейчас для роста бобовых? ${(weather == true) && (awning == true) && (humidity == 20) && (season != "зима")}")

}