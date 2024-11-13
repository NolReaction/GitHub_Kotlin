import Codewars.kyu5.*
import Codewars.kyu6.*
import Codewars.kyu7.*
import Codewars.kyu8.*
import Regex.*

fun main() {

    // CHECK repeatStr - Done
    println("CHECK repeatStr:")
    println(StringRepeat.repeatStr(5,"Hi!"))

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
    println("$oddNum is ${EvenOrOdd.evenOrOdd(oddNum)}") // Odd
    println("$evenNum is ${EvenOrOdd.evenOrOdd(evenNum)}") // Even

    // CHECK VowelCount - Done
    println("\nVowelCount:")
    println(VowelCount.getCount("aaaagrgtgre"))

    // CHECK SumOfPositive - Done
    println("\nSumOfPositive:")
    val mySumOfArray = intArrayOf(1, 10, -42, 24, 55, -1, 23, 0)
    println(SumOfPositive.sum(mySumOfArray))

    // CHECK Stop_gninnipS_My_sdroW
    println("\nStop_gninnipS_My_sdroW:")
    val spinTest1 = "This is a test"
    val spinTest2 = "This is another test"
    println(Stop_gninnipS_My_sdroW.spinWords(spinTest1))
    println(Stop_gninnipS_My_sdroW.spinWords(spinTest2))

    // CHECK PersistentBugger
    println("\nPersistentBugger:")
    println(PersistentBugger.persistence(39))
    println(PersistentBugger.persistence(999))
    println(PersistentBugger.persistence(4))

    // CHECK RGB_To_Hex_Conversion
    println("\nRGB_To_Hex_Conversion:")
    println(RGB_To_Hex_Conversion.rgb(255, 255, 255))
    println(RGB_To_Hex_Conversion.rgb(255, 255, 300))
    println(RGB_To_Hex_Conversion.rgb(0, 0, 0))
    println(RGB_To_Hex_Conversion.rgb(148, 0, 211))
    // CHECK RGB_To_Hex_Conversion VARIANT 2
    println("RGB_To_Hex_Conversion v2:")
    println(RGB_To_Hex_Conversion.rgb2(255, 255, 255))
    println(RGB_To_Hex_Conversion.rgb2(255, 255, 300))
    println(RGB_To_Hex_Conversion.rgb2(0, 0, 0))
    println(RGB_To_Hex_Conversion.rgb2(148, 0, 211))

    // CHECK OppositesAttract
    println("\nOppositesAttract:")
    println(OppositesAttract.loveFun(2, 1)) // true
    println(OppositesAttract.loveFun(2, 2)) // false

    // CHECK ShortestWord
    println("\nShortestWord:")
    println(ShortestWord.findShort("HELLO6 HI3 GOOD5 A2"))
    // CHECK ShortestWord VARIANT 2
    println("ShortestWord v2:")
    println(ShortestWord.findShort2("HELLO6 HI3 GOOD5 A2"))

    // CHECK RemoveStringSpaces
    println("\nRemoveStringSpaces:")
    println(RemoveStringSpaces.noSpace("8aaaaa dddd r     ")) // "8aaaaaddddr"

    // CHECK IfYouCantSleepJustCountSheep
    println("\nIfYouCantSleepJustCountSheep:")
    println(IfYouCantSleepJustCountSheep.countingSheep(3))
    // CHECK IfYouCantSleepJustCountSheep VARIANT 2
    println("IfYouCantSleepJustCountSheep v2:")
    println(IfYouCantSleepJustCountSheep.countingSheep2(3))
    // CHECK IfYouCantSleepJustCountSheep VARIANT 3
    println("IfYouCantSleepJustCountSheep v3:")
    println(IfYouCantSleepJustCountSheep.countingSheep3(3))

    // CHECK DisemvowelTrolls
    println("\nDisemvowelTrolls:")
    println(DisemvowelTrolls.disemvowel("This website is for losers LOL!"))
    // CHECK DisemvowelTrolls VARIANT 2
    println("DisemvowelTrolls v2:")
    println(DisemvowelTrolls.disemvowel2("This website is for losers LOL!"))

    // CHECK NumberExtractor
    println("\nNumberExtractor:")
    println(R_NumberExtractor.extractNumbers("На улице было -10 градусов, а к вечеру стало 5"))  // Ожидаемый результат: "-10 5"

    // CHECK DateValidator
    println("\nDateValidator:")
    println(R_DateValidator.isValidDateFormat("25.12.2021"))  // Ожидаемый результат: true
    println(R_DateValidator.isValidDateFormat("31.13.2025"))  // Ожидаемый результат: false

    // CHECK WhitespaceReplacer
    println("\nWhitespaceReplacer:")
    println(R_WhitespaceReplacer.replaceSpacesWithHyphens("Hello how are you"))  // Ожидаемый результат: "Hello-how-are-you"

    // CHECK EmailExtractor
    println("\nEmailExtractor:")
    println(R_EmailExtractor.extractEmails("Свяжитесь с нами по email info@company.com или support@help.org"))  // Ожидаемый результат: "info@company.com support@help.org"

    // CHECK IPAddressValidator
    println("\nIPAddressValidator:")
    println(R_IPAddressValidator.isValidIPv4Address("192.168.1.1"))  // Ожидаемый результат: true
    println(R_IPAddressValidator.isValidIPv4Address("256.100.50.25"))  // Ожидаемый результат: false

    //

}