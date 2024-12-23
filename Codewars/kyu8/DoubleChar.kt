// https://www.codewars.com/kata/56b1f01c247c01db92000076
/*
Given a string, you have to return a string in which each character (case-sensitive) is repeated once.

Examples (Input -> Output):
* "String"      -> "SSttrriinngg"
* "Hello World" -> "HHeelllloo  WWoorrlldd"
* "1234!_ "     -> "11223344!!__  "
 */


package Codewars.kyu8

object DoubleChar {
    fun doubleChar(s: String): String {

        return s.toCharArray().joinToString("") { "$it$it" }

    }
}

// Done