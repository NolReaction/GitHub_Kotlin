// https://www.codewars.com/kata/52fba66badcd10859f00097e
/*
Trolls are attacking your comment section!

A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

Your task is to write a function that takes a string and return a new string with all vowels removed.

For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.
 */


package Codewars.kyu7

object DisemvowelTrolls {

    fun disemvowel(str: String): String {

        val vowels = setOf(
            'a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U'
        )
        return str.filter { it !in vowels }

    }

    fun disemvowel2(str: String): String {

        return str.replace(Regex("[AaEeIiOoUu]"), "")

    }

}

// Done