class Database {

    companion object {

        private var instance: Database? = null

        fun getInstance(): Database? {

            if (instance == null) {
                instance = Database()
            }
            return instance
        }
    }
}

fun main(args: Array<String>) {

    val instance = Database.getInstance()
    val instance2 = Database.getInstance()

    println(instance) // Database@f6f4d33
    println(instance2) // Database@f6f4d33 - same
}