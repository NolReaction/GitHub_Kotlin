/*
    NumberExtractor:
    This task required writing a function that finds all integers in a string, including negative numbers,
    and returns them as a space-separated string. For example, given the input "It was -10 degrees, then it reached 5",
    the function should return "-10 5".
*/


package Regex

object R_NumberExtractor {

    // Извлекает все числа из строки, включая отрицательные
    fun extractNumbers(input: String): String {
        return Regex("-?\\d+").findAll(input).joinToString(" ") { match -> match.value }
    }

}

// Done