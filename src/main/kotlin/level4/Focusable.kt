package level4

interface Focusable {

    fun setFocus(b: Boolean) =
        println("i ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("i'm clickable!")
}