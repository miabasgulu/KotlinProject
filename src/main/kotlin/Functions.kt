fun main() {

    sayHello("Mete", 2)

    val hasInternetConnection = false

    if (hasInternetConnection) {
        getData("Here is your DATA")
    } else {
        showMessage()
    }

    println("---------------------------------------------------------------------------")

    val maxNum1 = getMaxNumber1(7, 8)
    println(maxNum1)

    val maxNum2 = getMaxNumber2(7, 8)
    println(maxNum2)

    val maxNum3 = getMaxNumber3(7, 9, 5)
    println(maxNum3)

    println("---------------------------------------------------------------------------")

    sendMessage(
        //name = "Tomris",
        message = "How are you doing?"
    )

    println("---------------------------------------------------------------------------")

    println(sum(1, 3, 5, 7, 9))
}



fun sayHello(name: String, num: Int) {
    println("Hello, $name $num")
}

fun getData(data: String) {
    println("Your data is: $data")
}

fun showMessage() {
    println("There is NO internet connection")
}

// Function with RETURN
fun getMaxNumber1(a: Int, b: Int): Int {
    val max = if (a > b) a else b
    return max
}

fun getMaxNumber2(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// Function Overloading

fun getMaxNumber3(a: Int, b: Int) = if (a > b) a else b

fun getMaxNumber3(a: Double, b: Double) = if (a > b) a else b

fun getMaxNumber3(a: Int, b: Int, c: Int): Int {
    return if (a >= b && a >= c) {
        a
    } else if (b >= a && b >= c) {
        b
    } else {
        c
    }
}

// Function with default values

fun sendMessage(name: String = "User", message: String = sendDefaultText()) {
    println("$name, $message")
}

fun sendDefaultText() = "You are welcome!"

// Function with "vararg"

fun sum(vararg nums: Int): Int {
    var sum = 0
    for (num in nums) {
        sum += num
    }
    return sum
}