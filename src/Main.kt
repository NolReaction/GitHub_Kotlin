package src

import Codewars.kyu5.*
import Codewars.kyu6.*
import Codewars.kyu7.*
import Codewars.kyu8.*
import Regex.*

fun main() {

    // CHECK repeatStr - Done
    println("CHECK repeatStr:")
    println(StringRepeat.repeatStr(5, "Hi!"))

    // CHECK FixStringCase - Done
    println("\nCHECK FixStringCase:")
    println(FixStringCase.solve("HELlo"))

    // CHECK CalculateBMI - Done
    println("\nCHECK CalculateBMI:")
    println(CalculateBMI.bmi(55.0, 1.75))

    // CHECK EvenOrOdd - Done
    println("\nEvenOrOdd:")
    val oddNum = 15
    val evenNum = 20
    println("$oddNum is ${EvenOrOdd.evenOrOdd(oddNum)}") // Expected: Odd
    println("$evenNum is ${EvenOrOdd.evenOrOdd(evenNum)}") // Expected: Even

    // CHECK VowelCount - Done
    println("\nVowelCount:")
    println(VowelCount.getCount("aaaagrgtgre"))

    // CHECK SumOfPositive - Done
    println("\nSumOfPositive:")
    val mySumOfArray = intArrayOf(1, 10, -42, 24, 55, -1, 23, 0)
    println(SumOfPositive.sum(mySumOfArray))

    // CHECK Stop_gninnipS_My_sdroW - Done
    println("\nStop_gninnipS_My_sdroW:")
    val spinTest1 = "This is a test"
    val spinTest2 = "This is another test"
    println(Stop_gninnipS_My_sdroW.spinWords(spinTest1))
    println(Stop_gninnipS_My_sdroW.spinWords(spinTest2))

    // CHECK PersistentBugger - Done
    println("\nPersistentBugger:")
    println(PersistentBugger.persistence(39))
    println(PersistentBugger.persistence(999))
    println(PersistentBugger.persistence(4))

    // CHECK RGB_To_Hex_Conversion - Done
    println("\nRGB_To_Hex_Conversion:")
    println(RGB_To_Hex_Conversion.rgb(255, 255, 255))
    println(RGB_To_Hex_Conversion.rgb(255, 255, 300))
    println(RGB_To_Hex_Conversion.rgb(0, 0, 0))
    println(RGB_To_Hex_Conversion.rgb(148, 0, 211))
    // CHECK RGB_To_Hex_Conversion VARIANT 2 - Done
    println("RGB_To_Hex_Conversion v2:")
    println(RGB_To_Hex_Conversion.rgb2(255, 255, 255))
    println(RGB_To_Hex_Conversion.rgb2(255, 255, 300))
    println(RGB_To_Hex_Conversion.rgb2(0, 0, 0))
    println(RGB_To_Hex_Conversion.rgb2(148, 0, 211))

    // CHECK OppositesAttract - Done
    println("\nOppositesAttract:")
    println(OppositesAttract.loveFun(2, 1)) // Expected: true
    println(OppositesAttract.loveFun(2, 2)) // Expected: false

    // CHECK ShortestWord - Done
    println("\nShortestWord:")
    println(ShortestWord.findShort("HELLO6 HI3 GOOD5 A2"))
    // CHECK ShortestWord VARIANT 2 - Done
    println("ShortestWord v2:")
    println(ShortestWord.findShort2("HELLO6 HI3 GOOD5 A2"))

    // CHECK RemoveStringSpaces - Done
    println("\nRemoveStringSpaces:")
    println(RemoveStringSpaces.noSpace("8aaaaa dddd r     ")) // Expected: "8aaaaaddddr"

    // CHECK IfYouCantSleepJustCountSheep - Done
    println("\nIfYouCantSleepJustCountSheep:")
    println(IfYouCantSleepJustCountSheep.countingSheep(3))
    // CHECK IfYouCantSleepJustCountSheep VARIANT 2 - Done
    println("IfYouCantSleepJustCountSheep v2:")
    println(IfYouCantSleepJustCountSheep.countingSheep2(3))
    // CHECK IfYouCantSleepJustCountSheep VARIANT 3 - Done
    println("IfYouCantSleepJustCountSheep v3:")
    println(IfYouCantSleepJustCountSheep.countingSheep3(3))

    // CHECK DisemvowelTrolls - Done
    println("\nDisemvowelTrolls:")
    println(DisemvowelTrolls.disemvowel("This website is for losers LOL!"))
    // CHECK DisemvowelTrolls VARIANT 2 - Done
    println("DisemvowelTrolls v2:")
    println(DisemvowelTrolls.disemvowel2("This website is for losers LOL!"))

    // CHECK NumberExtractor - Done
    println("\nNumberExtractor:")
    println(R_NumberExtractor.extractNumbers("It was -10 degrees, then it reached 5"))  // Expected result: "-10 5"

    // CHECK DateValidator - Done
    println("\nDateValidator:")
    println(R_DateValidator.isValidDateFormat("25.12.2021"))  // Expected result: true
    println(R_DateValidator.isValidDateFormat("31.13.2025"))  // Expected result: false

    // CHECK WhitespaceReplacer - Done
    println("\nWhitespaceReplacer:")
    println(R_WhitespaceReplacer.replaceSpacesWithHyphens("Hello how are you"))  // Expected result: "Hello-how-are-you"

    // CHECK EmailExtractor - Done
    println("\nEmailExtractor:")
    println(R_EmailExtractor.extractEmails("Contact us at info@company.com or support@help.org"))  // Expected result: "info@company.com support@help.org"

    // CHECK IPAddressValidator - Done
    println("\nIPAddressValidator:")
    println(R_IPAddressValidator.isValidIPv4Address("192.168.1.1"))  // Expected result: true
    println(R_IPAddressValidator.isValidIPv4Address("256.100.50.25"))  // Expected result: false

    // CHECK DoubleChar - Done
    println("\nDoubleChar:")
    println(DoubleChar.doubleChar("Hello"))
    println(DoubleChar.doubleChar("Hello World"))
    println(DoubleChar.doubleChar("1234!_"))

    // CHECK CountOfPositivesSumOfNegatives - Done
    println("\nCountOfPositivesSumOfNegatives:")
    val testArray1 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15)
    val testArray2 = emptyArray<Int>()
    println(CountOfPositivesSumOfNegatives.countPositivesSumNegatives(testArray1).joinToString())
    println(CountOfPositivesSumOfNegatives.countPositivesSumNegatives(testArray2).joinToString())

    // CHECK SumMixedArray - Done
    println("\nSumMixedArray:")
    println(SumMixedArray.sum(listOf(1, "100", 600, "76")))

    // CHECK KeepHydrated - Done
    println("\nKeepHydrated:")
    println(KeepHydrated.litres(3.0))
    println(KeepHydrated.litres(6.7))
    println(KeepHydrated.litres(11.8))

    // CHECK BeginnerSeries2Clock - Done
    println(("\nBeginnerSeries2Clock:"))
    println(BeginnerSeries2Clock.past(0, 1, 1))

    // CHECK GrowthOfAPopulation - Done
    println(("\nGrowthOfAPopulation:"))
    println(GrowthOfAPopulation.nbYear(1000, 2.0, 50, 1200))
    println(GrowthOfAPopulation.nbYear(1500, 5.0, 100, 5000))
    println(GrowthOfAPopulation.nbYear(1500000, 2.5, 10000, 2000000))


    // CHECK
    println(("\n:"))
    println()


}
