import Codewars.kyu7.*
import Codewars.kyu8.*

fun main() {

    // CHECK repeatStr
    println("CHECK repeatStr")
    println(StringRepeat.repeatStr(5,"Hi!"))

    // CHECK FixStringCase
    println("\nCHECK FixStringCase")
    println(FixStringCase.solve("HELlo"))

    // CHECK CalculateBMI
    println("\nCHECK CalculateBMI")
    println(CalculateBMI.bmi(55.0, 1.75))

    // CHECK EvenOrOdd
    println("\nEvenOrOdd")
    val oddNum = 15
    val evenNum = 20
    println("$oddNum is ${EvenOrOdd.evenOrOdd(oddNum)}") // Odd
    println("$evenNum is ${EvenOrOdd.evenOrOdd(evenNum)}") // Even

    // CHECK VowelCount
    println("\nVowelCount")
    println(VowelCount.getCount("aaaagrgtgre"))


}