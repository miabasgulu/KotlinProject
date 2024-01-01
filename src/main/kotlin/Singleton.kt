/*
LONGER WAY:

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
 */

// PREFERRED WAY:

object Database {
    init {
        println("Database object created")
    }
}

fun main(args: Array<String>) {

    /*
        val instance = Database.getInstance()
        val instance2 = Database.getInstance()

        println(instance) // Database@f6f4d33
        println(instance2) // Database@f6f4d33 - same
     */

    println(Database)   // Database object created
                        // Database@4a574795
    println(Database)   // Database@4a574795
    println(Database)   // Database@4a574795
}