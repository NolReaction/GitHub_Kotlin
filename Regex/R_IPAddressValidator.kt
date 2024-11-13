/*
    IPAddressValidator:
    The task was to write a function that checks if a string is a valid IPv4 address. A valid IP address
    consists of four numbers (octets) ranging from 0 to 255, separated by dots. For example, "192.168.1.1"
    is a valid IP, while "256.100.50.25" is not.
*/


package Regex

object R_IPAddressValidator {

    // Проверяет, является ли строка корректным IPv4-адресом
    fun isValidIPv4Address(input: String): Boolean {
        val regex = Regex(
            "^(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\." +
                    "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\." +
                    "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\." +
                    "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])$"
        )
        return regex.matches(input)
    }

}

// Done