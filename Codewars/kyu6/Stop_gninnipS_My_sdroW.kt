// https://www.codewars.com/kata/5264d2b162488dc400000001
/*
Write a function that takes in a string of one or more words, and returns the same string, but with all words that have five or more letters reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

Examples:

"Hey fellow warriors"  --> "Hey wollef sroirraw"
"This is a test        --> "This is a test"
"This is another test" --> "This is rehtona test"
 */


package Codewars.kyu6

object Stop_gninnipS_My_sdroW {

    fun spinWords(sentence: String): String {

        val words = sentence.split(" ")

        val transformedWords = words.map { word ->
            if (word.length >= 5) word.reversed() else word
        }

        return transformedWords.joinToString(" ")
    }

}

// Done