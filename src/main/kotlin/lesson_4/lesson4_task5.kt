package org.example.lesson_4

const val MINIMUM_STAFF = 55
const val MAXIMUM_STAFF = 70
const val MINIMUM_PROVISIONS = 50
const val NO_DAMAGE_DONE = true
const val FAVORABLE_CONDITIONS_FOR_PLANE = true

fun main() {

    println("У корабля нет повреждений? ")
    val damage = readln().toBoolean()

    println("Текущий состав экипажа: ")
    val crewComplement = readln().toInt()

    println("Количество ящиков провизии: ")
    val numberBoxProvisions = readln().toInt()

    println("Благоприятность метеоусловий?")
    val favorableCondition = readln().toBoolean()


    print("Корабль может отправиться в плавание? : " +
            "${((damage == NO_DAMAGE_DONE) && (crewComplement >= MINIMUM_STAFF && crewComplement <= MAXIMUM_STAFF ) && (numberBoxProvisions > MINIMUM_PROVISIONS))
                    || ((damage != NO_DAMAGE_DONE) && (crewComplement == MAXIMUM_STAFF) && (numberBoxProvisions >= MINIMUM_PROVISIONS) && (favorableCondition == FAVORABLE_CONDITIONS_FOR_PLANE))}")

}