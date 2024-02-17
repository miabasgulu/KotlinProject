interface Engine {
    fun startEngine()
}

class Truck(val name: String, val color: String) : Engine {
    override fun startEngine() {
        println("The TRUCK engine is starting")
    }
}

class Plane(val name: String, val color: String) : Engine {
    override fun startEngine() {
        println("The PLANE engine is starting")
    }

}

class Motorcycle(val name: String, val color: String) : Engine {
    override fun startEngine() {
        println("The MOTORCYCLE engine is starting")
    }

}