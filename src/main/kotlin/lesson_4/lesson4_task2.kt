package org.example.lesson_4

const val MINIMUM_WEIGHT = 35
const val MAXIMUM_WEIGHT = 100
const val MAXIMUM_CAPACITY = 100

fun main() {

    val weightFirstCargo = 20
    val capacityFirstCargo = 80
    val weightSecondCargo = 50
    val capacitySecondCargo = 100

    println("Груз с весом $weightFirstCargo кг и объемом $capacityFirstCargo л соответствует категории" +
            " 'Average': ${(weightFirstCargo <= MAXIMUM_WEIGHT) && (weightFirstCargo > MINIMUM_WEIGHT) && (capacityFirstCargo < MAXIMUM_CAPACITY)}")

    println("Груз с весом $weightSecondCargo кг и объемом $capacitySecondCargo л соответствует категории" +
            " 'Average': ${(weightSecondCargo <= MAXIMUM_WEIGHT) && (weightSecondCargo > MINIMUM_WEIGHT) && (capacitySecondCargo < MAXIMUM_CAPACITY)}")
}