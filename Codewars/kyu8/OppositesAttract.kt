// https://www.codewars.com/kata/555086d53eac039a2a000083/
/*
Timmy & Sarah think they are in love,
but around where they live,
they will only know once they pick a flower each.

    If one of the flowers has an even number of petals
    and
    the other has an odd number of petals it means they are in love.

Write a function that will take the number of petals of each flower
and
return true if they are in love and false if they aren't.
 */


package Codewars.kyu8

object OppositesAttract {

    fun loveFun(flowerA: Int, flowerB: Int): Boolean {
        return (flowerA % 2 != flowerB % 2)
    }
}

// Done