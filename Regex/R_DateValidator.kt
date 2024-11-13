/*
    DateValidator:
    The task was to create a function that checks if a string is a valid date in the format dd.mm.yyyy.
    The day should be between 01 and 31, the month between 01 and 12, and the year should be four digits.
    For example, "25.12.2021" should be valid, while "31.13.2025" should not.
*/


package Regex

object R_DateValidator {

    // Checks if the string is a date in dd.mm.yyyy format
    fun isValidDateFormat(input: String): Boolean {
        return Regex("([0-2][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.\\d{4}").matches(input)
    }
}

// Done