package org.example.lesson_4

const val CRITERIA_SUNNY_WEATHER = true
const val CRITERIA_OPEN_TENT = true
const val CRITERIA_AIR_HUMIDITY = 20
const val CRITERIA_SEASON = "зима"

fun main() {

    val weather: Boolean = true
    val tent: Boolean = true
    val humidity = 20
    val season = "зима"

    print("Благоприятные ли условия сейчас для роста бобовых? " +
            "${(weather == CRITERIA_SUNNY_WEATHER) && (tent == CRITERIA_OPEN_TENT) && 
                    (humidity == CRITERIA_AIR_HUMIDITY) && (season != CRITERIA_SEASON)}")

}