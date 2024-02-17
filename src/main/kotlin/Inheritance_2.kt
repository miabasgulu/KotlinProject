fun main() {

    val view = View()
    val button = Button("Submit", "Center")
    val roundButton = RoundButton("Sign up", "Center", 25)

    view.draw()
    button.draw()
    roundButton.draw()
}

open class View() {
    open fun draw() {
        println("Drawing the view")
    }
}

open class Button(val text: String, val orientation: String) : View() {

    override fun draw() {
        //here is the code for creating the button
        println("Drawing the button")
        super.draw()
    }
}

class RoundButton(text: String, orientation: String, val corner: Int) : Button(text, orientation) {

    override fun draw() {
        println("Drawing the round button")
    }
}