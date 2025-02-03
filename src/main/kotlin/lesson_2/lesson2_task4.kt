package org.example.lesson_2

fun main() {
    val crystalsWithoutBuff = 7
    val ironsWithoutBuff = 11
    val buff: Float = 1.2f
    val bonusCrystals = (crystalsWithoutBuff * buff - crystalsWithoutBuff)
    val wholeCrystals: Int = bonusCrystals.toInt()
    val bonusIrons = (ironsWithoutBuff * buff - ironsWithoutBuff)
    val wholeIrons: Int = bonusIrons.toInt()
    println("Количество дополнительных кристаллов = " + wholeCrystals)
    println("Количество дополнительной железной руды = " + wholeIrons)
}