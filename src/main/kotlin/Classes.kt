class Car(make: String, var model: String, var color: String, var doors: Int) {

    // Primary constructor, properties, parameters

    var make = make.trim()

    fun move() {
        println("Car $make is moving")
    }

    fun stop() {
        println("Car $make has stopped")
    }
}

fun main(args: Array<String>) {
    val car1 = Car("  Tesla  ", "Model S", "White", 4)
//    car1.make = "Tesla"
//    car1.model = "Model S"
//    car1.color = "White"
//    car1.doors = 4

    println("Make: ${car1.make}")
    println("Model: ${car1.model}")
    println("Color: ${car1.color}")
    println("Doors: ${car1.doors}")

    car1.move()
    car1.stop()

    val car2 = Car("Ford", "Mustang", "Blue", 2)
//    car2.make = "Ford"
//    car2.model = "Mustang"
//    car2.color = "Blue"
//    car2.doors = 2

    println("\n")
    println("Make: ${car2.make}")
    println("Model: ${car2.model}")
    println("Color: ${car2.color}")
    println("Doors: ${car2.doors}")

    car2.move()
    car2.stop()
}