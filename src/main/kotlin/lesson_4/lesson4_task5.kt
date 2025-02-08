package org.example.lesson_4

const val MINIMUM_STAFF = 55
const val MAXIMUM_STAFF = 70
const val MINIMUM_PROVISIONS = 50

fun main() {

    println("У корабля есть повреждения? ")
    val damage = readln().toBoolean()

    println("Текущий состав экипажа: ")
    val crewComplement = readln().toInt()

    println("Количество ящиков провизии: ")
    val numberBoxProvisions = readln().toInt()

    println("Благоприятность метеоусловий?")
    val favorableCondition = readln().toBoolean()


    print("Корабль может отправиться в плавание? : " +
            "${((damage == false) && (crewComplement >= MINIMUM_STAFF && crewComplement <= MAXIMUM_STAFF ) && (numberBoxProvisions > 50))
                    || ((damage == true) && (crewComplement == MAXIMUM_STAFF) && (numberBoxProvisions >= MINIMUM_PROVISIONS) && (favorableCondition == true))}")

}