import Codewars.kyu7.*
import Codewars.kyu8.*

fun main() {

    // CHECK repeatStr - Done
    println("CHECK repeatStr:")
    println(StringRepeat.repeatStr(5,"Hi!"))

    // CHECK FixStringCase - Done
    println("\nCHECK FixStringCase:")
    println(FixStringCase.solve("HELlo"))

    // CHECK CalculateBMI - Done
    println("\nCHECK CalculateBMI:")
    println(CalculateBMI.bmi(55.0, 1.75))

    // CHECK EvenOrOdd - Done
    println("\nEvenOrOdd:")
    val oddNum = 15
    val evenNum = 20
    println("$oddNum is ${EvenOrOdd.evenOrOdd(oddNum)}") // Odd
    println("$evenNum is ${EvenOrOdd.evenOrOdd(evenNum)}") // Even

    // CHECK VowelCount - Done
    println("\nVowelCount:")
    println(VowelCount.getCount("aaaagrgtgre"))

    // CHECK SumOfPositive - Done
    println("\nSumOfPositive:")
    val mySumOfArray = intArrayOf(1, 10, -42, 24, 55, -1, 23, 0)
    println(SumOfPositive.sum(mySumOfArray))

}