package org.example.lesson_2

fun main() {
    val staff = 50
    val salaryStaff = 30000
    val interns = 30
    val salaryOfInterns = 20000
    val allSalaryOfEmployees = staff * salaryStaff
    val generalExpenses = allSalaryOfEmployees + interns * salaryOfInterns
    val averageExpenses = generalExpenses / (staff + interns)

    println(allSalaryOfEmployees)
    println(generalExpenses)
    println(averageExpenses)
}