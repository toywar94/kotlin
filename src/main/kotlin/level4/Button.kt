package level4

class Button : Clickable, Focusable {

    override fun click() = println("i was clicked")

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }

}


fun main(args: Array<String>) {

    Button().click()
    Button().showOff()

    println("*********************")

    val button = Button()
    button.showOff()
    button.setFocus(false)
    button.click()
}

