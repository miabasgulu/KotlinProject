/*
   Object Expression or Unanimous class
*/

fun main() {

    val loginButton = Buttons("Login", 1001, object : OnClickListener {
        override fun onClick() {
            // Login the user
        }

    })

    val signUpButton = Buttons("Sing Up", 1002, object : OnClickListener {
        override fun onClick() {
            // Sign up the user
        }

    })
}

interface OnClickListener {
    fun onClick()
}

class Buttons(val text: String, val id: Int, onClickListener: OnClickListener)

class ClickListener() : OnClickListener {
    override fun onClick() {

    }

}