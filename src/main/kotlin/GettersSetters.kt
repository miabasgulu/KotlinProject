class Person(fName: String, var lName: String, var age: Int) {

    var fName = fName

    //get() = field

        get() {
            return "First Name: $field"
        }
        set(value) {
            println("First name assigned as $value")
            field = value
        }
}

fun main(args: Array<String>) {

    val person = Person("Turan", "Altay", 33)

    person.fName = "Alparslan"

    println("PERSON")
    println(person.fName)
    println(person.lName)
    println(person.age)
}