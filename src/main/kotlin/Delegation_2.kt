import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main() {

    val user = UserTest()
    with(user) {
        firstName = "Mete"
        lastName = "Ismail"
    }

    with(user) {
        println(firstName)
        println(lastName)
    }
}

class UserTest {
    var firstName by FormatDelegate()
    var lastName by FormatDelegate()
}

class FormatDelegate : ReadWriteProperty<Any?, String> {
    var formattedString: String = ""
    override fun getValue(
        thisRef: Any?,
        property: KProperty<*>
    ): String {
        return formattedString
    }

    override fun setValue(
        thisRef: Any?,
        property: KProperty<*>,
        value: String
    ) {
        formattedString = value.lowercase()
    }

}