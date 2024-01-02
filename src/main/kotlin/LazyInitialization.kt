class Student(var fName: String, var lName: String, var id: Int) {

    init {
        println("Student $fName was created")
    }
}

fun main(args: Array<String>) {

    val student1 = Student("Kubra", "Student", 100)

    val student2 by lazy {
        Student("Ali", "Student 2", 200)
    }

    println(student2.fName)
}