fun main() {

    val car = Cars("BMW", "White", 1, 4)
    val plane = Planes("Boeing", "Blue", 2, 2)

    car.move()
    car.stop()

    plane.move()
    plane.stop()
}

open class Vehicles(val name: String, val color: String) {
    open fun move() {
        println("$name is moving")
    }

    open fun stop() {
        println("$name is stopped")
    }
}

class Cars(name: String, color: String, val engine: Int, val door: Int) : Vehicles(name, color) {

}

class Planes(name: String, color: String, val engine: Int, val door: Int) : Vehicles(name, color) {


    override fun move() {
        flying()
        super.move()
    }

    private fun flying() {
        println("The plane is flying")
    }
}