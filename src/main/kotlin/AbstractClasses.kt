abstract class EvCars {

    abstract fun move()
    abstract fun stop()
}

class Tesla(var make: String, var model: String, val door: Int) : EvCars() {
    override fun move() {
        TODO("Not yet implemented")
    }

    override fun stop() {
        TODO("Not yet implemented")
    }

}