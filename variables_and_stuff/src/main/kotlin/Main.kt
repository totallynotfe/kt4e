/*
Basic program to better understand variables in Kotlin
Date: 28-05-2022
Author: https://github.com/totallynotfe
 */

package variables_and_stuff

fun main(){
    // In Kotlin, we have 10 native variable types:

    // Variables that are immutable use the word val
    // Variables that are mutable use the word var

    // Integers (that are divided into 4 different types):

    // Byte
    println("Byte Type:")
    val byteNumber: Byte = 1
    println("byteNumber: $byteNumber\n")

    // Short
    println("Short Type:")
    val shortNumber: Short = 1
    println("shortNumber: $shortNumber\n")

    // Int
    println("Int Type:")
    val intNumber: Int = 100
    println("intNumber: $intNumber\n")

    // Long
    println("Long Type:")
    val longNumber: Long = 100000000
    println("longNumber: $longNumber\n")

    // Floating-point numbers (that are divided into two types):

    // Float
    println("Float Type:")
    val floatNumber: Float = 23.5f
    println("floatNumber: $floatNumber\n")

    // Double
    println("Double Type")
    val doubleNumber: Double = 23.5
    println("doubleNumber: $doubleNumber\n")

    // Chars
    println("Char Type:")
    val charVariable: Char = 'a'
    println("charVariable: $charVariable\n")

    // Strings
    println("String Type:")
    val stringVariable: String = "Something"
    println("stringVariable: $stringVariable\n")

    // We can have string templates
    println("String Templates Demonstration:")
    val price = """
    ${'$'}_9.99
    """
    println("price: $price")

    // Arrays
    println("Array Type:")
    val arrayOfInts: IntArray = IntArray(5)
    arrayOfInts.forEachIndexed { index, item -> println("IntArray[$index]: $item") }
    println()
    val arrayOfDouble: DoubleArray = DoubleArray(5)
    arrayOfDouble.forEachIndexed { index, item -> println("DoubleArray[$index]: $item") }
    println()

    // Booleans
    println("Boolean Type:")
    val booleanVariable : Boolean = true
    println("booleanVariable: $booleanVariable\n")



    // In Kotlin, we can have literal constants for our variables, and even some conventional notation as well
    println("Literal Constants Demonstration:")
    val decimalNumber = 123
    println("decimalNumber: $decimalNumber")
    val longerNumber = 123L
    println("longerNumber: $longerNumber\n")

    println("Conventional Notation Demonstration:")
    val hexadecimalNumber = 0x0F
    println("hexadecimalNumber: $hexadecimalNumber")
    val binaryNumber = 0b00001011
    println("binaryNumber: $binaryNumber\n")

    // Type conversion also works
    println("Type Conversion Demonstration:")
    val byteType: Byte = 1
    val intType: Int = byteType.toInt()
    println("byteType: $byteType\nintType: $intType\n")

    // Sometimes we don't have to explicitly do the type conversion
    // If we want to get the sum between an Int and a Long, it'll do the conversion to a Long automatically
    println("Implicit Type Conversion Demonstration:")
    val longType: Long = 1L;
    val result = longType + 1
    val type = result::class.java.typeName
    println("result: $result")
    println("Type(result): $type\n")

    // Basic operations between variables:
    println("Basic Operations Demonstration:")
    val num1 = 3
    val num2 = 4
    var res = num1 + num2
    println("Sum (+):")
    println("num1 + num2 = $res\n")

    res = num1 - num2
    println("Subtraction (-):")
    println("num1 - num2 = $res\n")

    res = num1 * num2
    println("Multiplication (*):")
    println("num1 * num2 = $res\n")

    val division = num1.toDouble() / num2.toDouble()
    println("Division (/):")
    println("num1 / num2 = $division\n")

    res = num1 % num2
    println("Mod (%):")
    println("num1 % num2 = $res\n")

    // We can perform Bitwise Operations in Kotlin
    val bitNumber = (1 shl 2) and 0x000FF000
    println("bitNumber = $bitNumber\n")
}
