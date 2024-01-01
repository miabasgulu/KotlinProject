class Food(var name: String, var color: String, var count: Int) {

    // var taste: String // Property must be initialized or be abstract

    lateinit var taste: String
}

fun main(args: Array<String>) {

    val food = Food("Lemon", "Yellow", 3)

    //println(food.taste) // UninitializedPropertyAccessException

    food.taste = "Sour"
    println("${food.name} tastes ${food.taste}")
}