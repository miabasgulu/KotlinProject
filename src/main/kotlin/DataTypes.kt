fun main() {

    println("Two types of comments")

    // end of line comment

    /*
    block comment
     */

    println("---------------------------------------------------------------------------")

    val fName: String = "Mete"
    var lName = "Abasgulu"
    lName = "Ismail"
    var age: Int = 40
    age = 41

    println("My name is $fName $lName")
    println("I am $age years old")

    println("---------------------------------------------------------------------------")

    val myNum1 = 2F
    val myNum2 = 2
    val myNum3 = 2.0

    println(myNum1) // 2.0
    println(myNum2) // 2
    println(myNum3) // 2.0

    println("---------------------------------------------------------------------------")

    val myChar = 'A'

    println("My char is $myChar")

    println("---------------------------------------------------------------------------")

    val myBoolean1 = true
    val myBoolean2 = false

    println("My boolean 1 is $myBoolean1 and boolean 2 is $myBoolean2")

    println("---------------------------------------------------------------------------")

    val byteMinValue = Byte.MIN_VALUE
    val byteMaxValue = Byte.MAX_VALUE

    println("Byte MIN value is $byteMinValue")
    println("Byte MAX value is $byteMaxValue")

    val shortMinValue = Short.MIN_VALUE
    val shortMaxValue = Short.MAX_VALUE

    println("Short MIN value is $shortMinValue")
    println("Short MAX value is $shortMaxValue")

    val intMinValue = Int.MIN_VALUE
    val intMaxValue = Int.MAX_VALUE

    println("Int MIN value is $intMinValue")
    println("Int MAX value is $intMaxValue")

    val longMinValue = Long.MIN_VALUE
    val longMaxValue = Long.MAX_VALUE

    println("Long MIN value is $longMinValue")
    println("Long MAX value is $longMaxValue")

    val floatMinValue = Float.MIN_VALUE
    val floatMaxValue = Float.MAX_VALUE

    println("Float MIN value is $floatMinValue")
    println("Float MAX value is $floatMaxValue")

    val doubleMinValue = Double.MIN_VALUE
    val doubleMaxValue = Double.MAX_VALUE

    println("Double MIN value is $doubleMinValue")
    println("Double MAX value is $doubleMaxValue")
}