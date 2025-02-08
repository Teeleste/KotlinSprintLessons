package org.example.lesson_2

const val FULL_PERCENT = 100

fun main() {

    val crystalsWithoutBuff = 7
    val ironsWithoutBuff = 11
    val buff = 20

    val bonusCrystals = ((crystalsWithoutBuff * buff) / FULL_PERCENT)

    val wholeCrystals: Int = bonusCrystals.toInt()

    val bonusIrons = ((ironsWithoutBuff * buff) / FULL_PERCENT)

    val wholeIrons: Int = bonusIrons.toInt()

    println("Количество дополнительных кристаллов = " + wholeCrystals)
    println("Количество дополнительной железной руды = " + wholeIrons)

}