fun main() {

    val isActive = false

    if (isActive) {
        println("User is active")

    } else {
        println("User is NOT active")
    }

    if (!isActive) {
        println("User is active")
    }

    val myNumber = 100

    if (myNumber > 150) {
        println("Number is greater than 150")

    } else if (myNumber <= 150) {
        println("Number is less than 150")

    } else {
        println("All the condition failed")
    }

    println("---------------------------------------------------------------------------")

    val isPlayed = true
    val score = 100

    if (isPlayed && score >= 100) {
        println("Next level is opened")
    }

    if (isPlayed || score == 50) {
        println("Next level is opened")
    }

    println("---------------------------------------------------------------------------")

    val num1 = 3
    val num2 = 7

    val conditionResult = if (num1 < 5 && num2 > 5) "The score is in range" else "The score is NOT in range"
    println("Tes condition result is: $conditionResult")

}