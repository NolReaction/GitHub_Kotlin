// https://www.codewars.com/kata/53da3dbb4a5168369a0000fe
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