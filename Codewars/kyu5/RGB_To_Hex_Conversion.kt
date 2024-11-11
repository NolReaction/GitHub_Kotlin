// https://www.codewars.com/kata/513e08acc600c94f01000001

/*
The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal representation being returned. Valid decimal values for RGB are 0 - 255. Any values that fall out of that range must be rounded to the closest valid value.

Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.

Examples (input --> output):
255, 255, 255 --> "FFFFFF"
255, 255, 300 --> "FFFFFF"
0, 0, 0       --> "000000"
148, 0, 211   --> "9400D3"
 */


package Codewars.kyu5

object RGB_To_Hex_Conversion {

    fun rgb(r: Int, g: Int, b: Int): String {

        val rgbMIN = 0
        val rgbMAX = 255

        val rHex = r.coerceIn(rgbMIN, rgbMAX).toString(16).padStart(2, '0')
        val gHex = g.coerceIn(rgbMIN, rgbMAX).toString(16).padStart(2, '0')
        val bHex = b.coerceIn(rgbMIN, rgbMAX).toString(16).padStart(2, '0')

        val hexColor = rHex + gHex + bHex

        return hexColor.uppercase()
    }

    fun rgb2 (r: Int, g: Int, b: Int): String {

        val translator16 = arrayOf(
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            'A', 'B', 'C', 'D', 'E', 'F'
            )

        val rgbMIN = 0
        val rgbMAX = 255

        // Ограничиваем значения r, g, b в диапазоне от 0 до 255
        val red = if (r < rgbMIN) rgbMIN else if (r > rgbMAX) rgbMAX else r
        val green = if (g < rgbMIN) rgbMIN else if (g > rgbMAX) rgbMAX else g
        val blue = if (b < rgbMIN) rgbMIN else if (b > rgbMAX) rgbMAX else b

        fun toHex(value: Int): String {
            val high = value / 16
            val low = value % 16
            return "${translator16[high]}${translator16[low]}"
        }

        val rHex = toHex(red)
        val gHex = toHex(green)
        val bHex = toHex(blue)

        val resultHex = rHex + gHex + bHex
        return resultHex.uppercase()
    }

}

// Done