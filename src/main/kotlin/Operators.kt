fun main () {

    var x = 4
    var y = 2

    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    println("---------------------------------------------------------------------------")

    var result = x + y
    println("Result = $result")

    result += 2
    println("Result = $result")

    result -= 2
    println("Result = $result")

    result *= 2
    println("Result = $result")

    result /= 2
    println("Result = $result")

    result %= 2
    println("Result = $result")

    println("4 + 2 * 3 = ${4 + 2 * 3}")
    println("4 / 2 * 3 = ${4 / 2 * 3}")
    println("4 + 2 - 3 = ${4 + 2 - 3}")
    println("4 - 2 + 3 = ${4 - 2 + 3}")
    println("4 - (2 + 3) = ${4 - (2 + 3)}")

    x = 0
    println("x = ${x++}")
    println("x = ${++x}")

}