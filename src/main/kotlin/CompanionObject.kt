fun main(args: Array<String>) {

    Calculator.min
    Calculator.max

    val result = Calculator.sum(3,7)
    println("Result: $result")
}

class Calculator {

    companion object {

        var min = 0
        var max = 100

        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
}
