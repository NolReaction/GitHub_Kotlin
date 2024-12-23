// https://www.codewars.com/kata/576bb71bbbcf0951d5000044
/*
Given an array of integers.

Return an array, where the first element is the count of positives numbers
and the second element is sum of negative numbers.
0 is neither positive nor negative.

If the input is an empty array or is null, return an empty array.

Example
For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15],
you should return [10, -65].
 */


package Codewars.kyu8

object CountOfPositivesSumOfNegatives {

    fun countPositivesSumNegatives(input : Array<Int>?) : Array<Int> {
        if (input.isNullOrEmpty()) return emptyArray()
        val (positive, negative) = input.partition { it > 0 }
        return arrayOf(positive.count(), negative.sum())
    }

}

// Done