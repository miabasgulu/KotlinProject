fun main(){

    var str: String? = "Name"
    str = null

    // Longer way

    if (str != null){
        println(str.length)
    }else{
        println("The variable is null")
    }

    println("---------------------------------------------------------------------------")

    // Shorter ways

    var str1: String? = null
    str1 = "Tomris"

    println(str1?.length) // null

    println(str1!!.length) // NullPointerException

    println("---------------------------------------------------------------------------")

    var text: String? = null

    // Elvis operator
    text = "It is NOT NULL"
    var text2 = text ?: "It is NULL"
    println(text2)

    // longer explanation
    if (text != null){
        println("It is NOT NULL")
    }else{
        println("It is NULL")
    }

}