package org.example.lesson_2

const val MINUTE = 60

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val departureTimeInMinutes = departureHour * MINUTE + departureMinute
    val travelTime = 457
    val arrivalTimeInMinutes = departureTimeInMinutes + travelTime
    val arrivalHour = arrivalTimeInMinutes / MINUTE
    val arrivalMinute = arrivalTimeInMinutes - (arrivalHour * MINUTE)

    val timeArrival = String.format("%d:%d", arrivalHour, arrivalMinute)
    print(timeArrival)

}