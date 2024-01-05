enum class Direction(var direction: String, var distance: Int) {

    EAST("east", 30),
    WEST("west", 40),
    SOUTH("south", 50),
    NORTH("north", 60);

    fun printData(){
        println("Direction: $direction and Distance: $distance")
    }
}

fun main(args: Array<String>) {

    println(Direction.EAST.direction)
    println(Direction.EAST.distance)
    println(Direction.EAST.name)

    Direction.EAST.printData()

    println("------------------------------------------")

    val direction = Direction.valueOf("SOUTH")

    when(direction){
        Direction.NORTH -> println("Direction is NORTH")
        Direction.SOUTH -> println("Direction is SOUTH")
        Direction.EAST -> println("Direction is EAST")
        Direction.WEST -> println("Direction is WEST")
    }
}