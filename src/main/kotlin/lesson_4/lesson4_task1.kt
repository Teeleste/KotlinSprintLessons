package org.example.lesson_4

const val NUMBER_TABLES = 13

fun main() {

    val bookingToday = 13
    val bookingTomorrow = 9

    val availabilityToday = bookingToday < NUMBER_TABLES
    val availabilityTomorrow = bookingTomorrow < NUMBER_TABLES

    print("Доступность столиков на сегодня: $availabilityToday \nДоступность столиков на завтра: $availabilityTomorrow ")
}