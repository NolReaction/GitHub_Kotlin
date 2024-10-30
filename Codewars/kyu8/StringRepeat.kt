/*
Write a function that accepts an integer n and a string s as parameters,
and returns a string of s repeated exactly n times.

Examples (input -> output)
6, "I"     -> "IIIIII"
5, "Hello" -> "HelloHelloHelloHelloHello"
 */


package Codewars.kyu8

object StringRepeat {
    fun repeatStr(n: Int, str: String): String = str.repeat(n)
}