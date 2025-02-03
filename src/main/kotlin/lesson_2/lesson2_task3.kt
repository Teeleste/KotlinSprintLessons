package org.example.lesson_2

const val minute = 60

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val departureTimeInMinutes = departureHour * minute + departureMinute
    val travelTime = 457
    val arrivalTimeInMinutes = departureTimeInMinutes + travelTime
    val arrivalHour = arrivalTimeInMinutes / minute
    val arrivalMinute = arrivalTimeInMinutes - (arrivalHour * minute)

    val timeArrival = String.format("%d:%d", arrivalHour, arrivalMinute)
    print(timeArrival)

}