class User(name: String, var lastName: String, var age: Int){

    var name: String

    init {
        if (name.lowercase().startsWith("m")){
            this.name = name
        }else{
            this.name = "User"
            println("User's name does not start with 'm' or 'M'")
        }
    }

}

fun main(args: Array<String>) {

    val user = User("Mete", "Khan", 33)
    val friend = User("Hamza", "Alparslan", 33)

    //println("User name: ${user.name}")
    println("User name: ${friend.name}")
}