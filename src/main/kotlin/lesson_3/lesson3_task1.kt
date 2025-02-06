package org.example.lesson_3

fun main() {

    var textHello: String
    val day = "Доброе утро, "
    val evening = "Добрый вечер, "
    val name = "Артур"

    textHello = "$day$name!"
    println(textHello)
    textHello = "$evening$name!"
    println(textHello)
}