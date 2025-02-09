package org.example.lesson_5

fun main() {
    val firstNumber = 5
    val secondNumber = 2
    println("Для доступа решите пример: $firstNumber + $secondNumber")
    val answer = readln().toInt()
    if (answer == firstNumber + secondNumber) {
        print("Добро пожаловать!")
    }
    else{
        print("Доступ запрещен.")
    }
}