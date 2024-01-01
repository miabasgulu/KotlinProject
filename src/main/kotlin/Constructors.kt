class Animal(var type: String, var color: String = "Color", var age: Int = 0) {
    // Constructor parameters default values

//    init {
//        println("Primary Constructor")
//    }

    /*
    constructor(type: String) : this(type, "Color", 0) {
        println("Secondary Constructor - 1")
    }

    constructor(type: String, color: String) : this(type, color, 0) {
        println("Secondary Constructor - 2")
    }
    */
}

fun main(args: Array<String>) {

    val dog = Animal("Alabash")
    val cat = Animal("Mastan", "White")
    val bunny = Animal("Doshan", "WhiteAndBlack", 3)

    val horse = Animal(age = 5, color = "Red", type = "Kohlen")

    println("DOG")

    println("Animal type: ${dog.type}")
    println("Animal color: ${dog.color}")
    println("Animal age: ${dog.age}")

    println("\nCAT")

    println("Animal type: ${cat.type}")
    println("Animal color: ${cat.color}")
    println("Animal age: ${cat.age}")

    println("\nBUNNY")

    println("Animal type: ${bunny.type}")
    println("Animal color: ${bunny.color}")
    println("Animal age: ${bunny.age}")

    println("\nHORSE")
    println("${horse.type}, ${horse.color}, ${horse.age}")
}