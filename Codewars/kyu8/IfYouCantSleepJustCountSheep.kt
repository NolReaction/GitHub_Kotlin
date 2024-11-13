// https://www.codewars.com/kata/5b077ebdaf15be5c7f000077
/*
If you can't sleep, just count sheeps!!

Task:
Given a non-negative integer,
3 for example,
return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
Input will always be valid, i.e. no negative integers.
 */


package Codewars.kyu8

object IfYouCantSleepJustCountSheep {

    fun countingSheep(num: Int): String{

        var counter = 1
        var resultStr = ""

        while (counter <= num) {
            resultStr += "$counter sheep..."
            counter++
        }

        return resultStr
    }

    fun countingSheep2(num: Int): String{

        val resultStr = StringBuilder()

        for (counter in 1..num) {
            resultStr.append("$counter sheep...")
        }

        return resultStr.toString()
    }

    fun countingSheep3(num: Int): String {
        return (1..num).joinToString("") { "$it sheep..." }
    }

}

// Done