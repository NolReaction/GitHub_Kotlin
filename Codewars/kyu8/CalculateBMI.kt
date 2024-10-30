// https://www.codewars.com/kata/57a429e253ba3381850000fb
/*
Write function bmi that calculates body mass index (bmi = weight / height^2).

if bmi <= 18.5 return "Underweight"

if bmi <= 25.0 return "Normal"

if bmi <= 30.0 return "Overweight"

if bmi > 30 return "Obese"
*/


package Codewars.kyu8

object CalculateBMI {

    fun bmi(weight: Double, height: Double): String {

        val bmi = weight / (height*height)

        return when {
            bmi > 30.0 -> "Obese"
            bmi > 25.0 -> "Overweight"
            bmi > 18.5 -> "Normal"
            else -> "Underweight"
        }

    }

}

// Done