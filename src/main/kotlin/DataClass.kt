fun main() {

    val user1 = AdminUser("Mete", "Ismail", 40)
    val user2 = AdminUser("Mete", "Ismail", 40)

    println(user1 == user2)
    println(user1 === user2)
    println(user1.equals(user2))

    println(user1)
    println(user2)
}

data class AdminUser(var firstName: String, var lastName: String, var age: Int)

/*
class AdminUser(var firstName: String, var lastName: String, var age: Int) {

    override fun equals(other: Any?): Boolean {

        if (this === other) {
            return true
        }

        if (other is AdminUser) {

            return this.firstName == other.firstName
                    && this.lastName == other.lastName
                    && this.age == other.age
        }
        return false
    }

    override fun hashCode(): Int {
        var result = firstName.hashCode()
        result = 31 * result + lastName.hashCode()
        result = 31 * result + age
        return result
    }

    override fun toString(): String {
        return "User(First name = '$firstName', Last name = '$lastName', Age = '$age')"
    }

}
*/