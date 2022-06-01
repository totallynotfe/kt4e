/*
Basic program to better understand variables in Kotlin
Date: 31-05-2022
Author: https://github.com/totallynotfe
*/

fun main (){

    // In Kotlin we have 5 types of control flow statements

    // If expressions
    println("if expression example:")
    var max: Int = 10
    if(max >= 10) max = 0
    println("max: $max")

    // We can also put an else in it
    println("if-else expression example")
    if(max === 0){
        max = 10
        println("max: $max")
    }
    else{
        max = 0
        println("max: $max")
    }

    println("if-else in one line example:")
    // if-else as an expression
    var number = if(max >= 10) 0 else 10
    println("number: $number")

    println("Branches of if expressions as blocks")
    // Branches of an if expressions can be blocks
    number = if(max >= 10){
        println("Yes")
        0
    }
    else{
        println("No")
        10
    }
    println("number: $number")

    println()
    // When expression
    println("when expressions example:")

    // The when expression is similar to a switch() in C programming
    var x: Int = 10
    when(x){
        10 -> println("x is 10!")
        20 -> println("x is 20!")
        else -> {
            println("x is neither 10 nor 20")
        }
    }

    // We can also write some conditions together
    println("when conditions together example:")
    x = 1
    when(x){
        0, 1 -> println("x == 0 or x == 1")
        else -> println("x is something else")
    }

    // We can use some arbitrary expressions as branch conditions
    println("when using arbitrary expression as branch example:")
    var s = "10"
    x = 10
    when(x){
        s.toInt() -> println("s encodes x")
        else -> println("s does not encodes x")
    }

    // There's also some ways of programming ranges in the "when" statement
    println("when using ranges as condition example:")
    x = 10
    var validNumbers = 1..20
    when(x){
        in 1..10 -> println("x is in range")
        in validNumbers -> println("x is valid")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }

    // "When" statements can also be written in functions
    println("when statements as functions example:")
    s = "prefix"
    fun hasPrefix(s: Any) = when(s){
        is String -> s.startsWith("prefix")
        else -> false
    }
    println(hasPrefix(s))

    // "When" statements can be used as if-else blocks as well
    println("when statements as if-else example:")
    s = ""
    when{
        s.isBlank() -> println("s is blank")
        s.isNotBlank() -> println("s is not blank")
        else -> println("none of the above")
    }

    // We can even use the "when" statement in another variable
    /*
    fun Request.getBody() =
        when(val response = executeRequest()){
            is Success -> response.body
            is HttpError -> throw HttpException(response.status)
        }
    */

    println()

    // For loops

    // We can use for loops with iterables
    println("for loop with iterable example:")
    var items = listOf("apple", "banana", "pineapple")
    for (item in items) {
        println(item)
    }

    println()

    // We can also use for loops with indexes
    println("for loop with iterable example:")
    for (index in items.indices){
        println("items[$index] = ${items[index]}")
    }

    println()

    // To iterate over a range of numbers we can use a range expression:
    println("Range expression example:")
    for (i in 1..3){
        println("number: $i")
    }

    println()

    for (i in 6 downTo 0 step 2){
        println("number: $i")
    }

    println()

    // We can also use an Array the same way we did in the variables_and_stuff project
    for((index, value) in items.withIndex()){
        println("items[$index] = $value")
    }

    println()

    // while loops

    // We can divide the while loop into while and do-while

    // while
    println("while loop example:")
    x = 5
    while(x != 0){
        println("x = $x")
        x--
    }

    println()

    // do-while
    x = 5
    do{
        println("x = $x")
        x--
    }while(x != 0)
}