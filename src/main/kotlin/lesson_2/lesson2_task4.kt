package org.example.lesson_2

fun main() {

    val crystalsWithoutBuff = 7
    val ironsWithoutBuff = 11
    val buff = 20
    val bonusCrystals = ((crystalsWithoutBuff * buff) / 100)
    val wholeCrystals: Int = bonusCrystals.toInt()
    val bonusIrons = ((ironsWithoutBuff * buff) / 100)
    val wholeIrons: Int = bonusIrons.toInt()
    println("Количество дополнительных кристаллов = " + wholeCrystals)
    println("Количество дополнительной железной руды = " + wholeIrons)

}