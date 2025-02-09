package org.example.lesson_5

fun main() {
    val firstNumber = 5
    val secondNumber = 31

    print("Введите первое число от 0 до 42: ")
    val firstNumberUser = readln().toInt()
    print("Введите второе число от 0 до 42: ")
    val secondNumberUser = readln().toInt()

    when {

        firstNumberUser == firstNumber || firstNumberUser == secondNumber -> {

            if ((secondNumberUser == secondNumber || secondNumberUser == firstNumber) && (secondNumberUser != firstNumberUser)) {
                println("Поздравляем! Вы выиграли главный приз!")
            } else
                println("Вы выиграли утешительный приз")
        }

        secondNumberUser == firstNumber || secondNumberUser == secondNumber -> {

            if ((firstNumberUser == firstNumber || firstNumberUser == secondNumber) && (secondNumberUser != firstNumberUser)) {
                println("Поздравляем! Вы выиграли главный приз!")
            } else
                println("Вы выиграли утешительный приз")
        }

        else -> {
            println("Неудача!")
        }
    }

    println("Победные числа - $firstNumber и $secondNumber")

}