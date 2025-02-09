package org.example.lesson_4

fun main() {

    val day = 6

    val handsAbsDay: Boolean = day % 2 != 0

    println(
        """
        Упражнения для рук: $handsAbsDay
        Упражнения для ног: ${!handsAbsDay}
        Упражнения для спины: ${!handsAbsDay}
        Упражнения для пресса: $handsAbsDay
        """.trimIndent()
    )

}