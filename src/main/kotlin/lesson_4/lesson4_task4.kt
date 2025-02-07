package org.example.lesson_4

fun main() {
    val day = 6

    val handsAbsDay: Boolean = day % 2 != 0
    val legBackDay: Boolean = day % 2 == 0

    println(
        """
        Упражнения для рук: $handsAbsDay
        Упражнения для ног: $legBackDay
        Упражнения для спины: $legBackDay
        Упражнения для пресса: $handsAbsDay
        """.trimIndent()
    )
}