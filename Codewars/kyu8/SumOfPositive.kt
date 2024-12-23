// https://www.codewars.com/kata/5715eaedb436cf5606000381
/*
You get an array of numbers, return the sum of all the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.
*/


package Codewars.kyu8

object SumOfPositive {

    fun sum(numbers: IntArray): Int {
        var result = 0

        for (i in numbers) {
            if (i > 0) {
                result += i
            }
        }
        return result
    }

}

// Done