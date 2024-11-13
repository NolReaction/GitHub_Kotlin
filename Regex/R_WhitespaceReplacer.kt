/*
    WhitespaceReplacer:
    Here, the task was to write a function that replaces all spaces in a string with hyphens. If there are
    multiple spaces in a row, they should be replaced by a single hyphen. For example, given the input
    "Hello how are you", the function should return "Hello-how-are-you".
*/


package Regex

object R_WhitespaceReplacer {

    // Replaces all spaces with hyphens
    fun replaceSpacesWithHyphens(input: String): String {
        return input.replace(Regex("\\s+"), "-")
    }

}

// Done