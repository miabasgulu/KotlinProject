fun main() {

    val names = arrayOf("Kubra", "Banu", "Tomris", "MySon")

    names[3] = "Hamza"

    println("My elder daughter is ${names[0]}")
    println("My youngest child is ${names[3]}")
    println("I have ${names.size} children")

    println("----------------------------------")

    val mixedData = arrayOf(1, 2, 3, 4, 5, "nine", "alp", 6, 7, '!', '.')

    for (i in mixedData) {

        if (i is Int) println("Numbers: $i")
    }

    println("---------------------------------------------------------------------------")

    // CHALLENGE

    // Create a function which accept an argument of Integers,
    // find which number is biggest and return it
    // another function to fin min amount in Array and return it
    // another function to combine these two and return max or min based on your need

    var numbers = arrayOf(7, 2, 3, 9, 7, 4, 2, 1, 8, 4, 34, 29, 0)

    println("Max value: ${findMax(numbers)}")

    println("Min value: ${findMin(numbers)}")

    val max = finMaxOrMin(numbers, true)
    val min = finMaxOrMin(numbers, false)

    println("Max number is: $max")
    println("Min number is: $min")
}


fun findMax(nums: Array<Int>): Int {
    var max = nums[0]
    for (num in nums) {
        if (num > max) max = num
    }
    return max
}

fun findMin(nums: Array<Int>): Int {
    var min = nums[0]
    for (num in nums) {
        if (num < min) min = num
    }
    return min
}

fun finMaxOrMin(nums: Array<Int>, searchMax: Boolean): Int {
    if (searchMax) {
        return findMax(nums)

    } else {
        return findMin(nums)
    }
}