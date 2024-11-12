// https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9
/*
Simple, given a string of words,
return the length of the shortest word(s).

String will never be empty, and you do not need to
account for different data types.
 */


package Codewars.kyu7

object ShortestWord {

    fun findShort(s: String): Int {

        return s.split(" ").minOf { it.length }

    }

    fun findShort2(s: String): Int {

        val words = s.split(" ")
        var minLength = Int.MAX_VALUE

        for (word in words) {
            val length = word.length
            if (length < minLength) {
                minLength = length
            }
        }

        return minLength
    }

}

// Done