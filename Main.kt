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
    println("15 is ${EvenOrOdd.evenOrOdd(15)}") // Odd
    println("20 is ${EvenOrOdd.evenOrOdd(20)}") // Even

}