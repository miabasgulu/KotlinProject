fun main() {

    /*
        For loop
     */

    // in range
    for (i in 1..5) {
        println("i = $i")
    }

    println("----------------------------------")

    // until
    for (j in 1 until 5) {
        println("j = $j")
    }

    println("----------------------------------")

    // step
    for (k in 1..<4 step 2) {
        println("k = $k")
    }

    println("----------------------------------")

    // downTo
    for (l in 5 downTo 1) {
        println("l = $l")
    }

    println("---------------------------------------------------------------------------")

    /*
        While loop
     */

    var number = 1

    while (number <= 5) {
        println("Number = $number")
        number++
    }

    println("---------------------------------------------------------------------------")

    /*
        Do while loop
     */

    number = 5

    do {
        println(number)
        number++
    } while (number < 5)

    println("---------------------------------------------------------------------------")

    // continue
    number = 0

    while (number < 7) {
        number++
        if (number in 3..5) {
            continue
        }
        println("Continue: $number")
    }

    println("----------------------------------")

    // break
    number = 1
    while (number <= 5) {
        if (number == 3) {
            break
        }
        number++
        println("Break: $number")
    }

    for (i in 1..5) {
        if (i == 4) {
            break
        }
        println("For break: $i")
    }

    println("---------------------------------------------------------------------------")

    /*
        Nested loop
     */

    number = 1

    while (number < 5) {
        println("Main loop: $number")
        number++

        var num = 1
        while (num < 5) {
            println("Inner loop: $num")
            num++
            if (num == 3) break
        }
    }

    println("----------------------------------")

    // Labels - outer@ break

    number = 1

    outer@ while (number < 5) {
        println("Main loop: $number")
        number++

        var num = 1
        while (num < 5) {
            println("Inner loop: $num")
            num++
            if (num == 3) break@outer
        }
    }

    println("---------------------------------------------------------------------------")

    // CHALLENGE
    // Take the arbitrary range of number, loop the numbers,
    // and find the number is even or odd, if number is odd skip
    // if even print it and count it

    var firstNum = 1
    var lastNum = 20
    var counter = 0

    for (i in firstNum..lastNum) {

        if (i % 2 != 0) {
            continue
        } else {
            println(i)
            counter++
        }
    }
    println("Count of even numbers: $counter")

    println("----------------------------------")

    // Second way using function and while loop

    firstNum = 1
    lastNum = 20
    counter = 0

    while (firstNum <= lastNum) {
        firstNum++
        if (!isNumberEven(firstNum)) continue

        println(firstNum)
        counter++
    }
    println("Even number: $counter")
}

fun isNumberEven(number: Int) = number % 2 == 0