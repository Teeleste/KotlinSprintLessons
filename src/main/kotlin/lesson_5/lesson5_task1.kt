package org.example.lesson_5

fun main() {
    println("Для доступа решите пример: 5 + 2")
    val answer = readln().toInt()
    if (answer == 7) {
        print("Добро пожаловать!")
    }
    else{
        print("Доступ запрещен.")
    }
}