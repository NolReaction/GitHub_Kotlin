/*
    EmailExtractor:
    This task required creating a function that extracts all email addresses from a string and returns them
    as a space-separated string. For example, given the input "Contact us at info@company.com or support@help.org",
    the function should return "info@company.com support@help.org".
*/


package Regex

object R_EmailExtractor {

    // Finds all email addresses in the string
    fun extractEmails(input: String): String {
        return Regex("[\\w.-]+@[\\w.-]+\\.[a-z]{2,}").findAll(input).joinToString(" ") { it.value }
    }

}

// Done