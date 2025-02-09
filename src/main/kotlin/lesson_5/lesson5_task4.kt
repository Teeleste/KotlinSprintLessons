package org.example.lesson_5

const val LOGIN_USER = "Zaphod"
const val PASSWORD_USER = "PanGalactic"

fun main() {
    println("Введите ваш логин для входа в систему:")

    val login = readln()

    if (login == LOGIN_USER) {
        println("Введите ваш пароль:")
        val password = readln()

        if (password == PASSWORD_USER) {
            println("Ваши данные проверены. Вам разрешено входить на борт корабля")
        } else println("Пароль неверен, проверьте данные.")

    } else println("Пользователь с такими данными не найден. Хотите зарегистрироваться?")

}