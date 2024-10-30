/*
Create a function that takes an integer as an argument and returns
"Even" for even numbers or "Odd" for odd numbers.
 */


package Codewars.kyu8

object EvenOrOdd {

    fun evenOrOdd(number: Int): String {
        return when {
            number % 2 == 0 -> "Even"
            else -> "Odd"
        }
    }

}

// Done