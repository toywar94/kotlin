package level1.clazz

import level1.User
import level1.enums.Color
import level1.enums.Color.*

class Funtion {
}

fun main(args: Array<String>) {

    val result = sum(10.5, 50.1);
    println(result)

    val result2 = testIf(10, 50)
    println(result2)
    println("My score : ${result2}")

    val user = User("minjae", false)
    println(user.name)
    println(user.isMarried)

    println(getMnemonic(ORANGE))
    println(mix(BLUE, YELLOW))
    println(mix(YELLOW, RED))



}

fun mix(c1: Color, c2: Color) =
    when (setOf(c1,c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("error color")
    }

fun getMnemonic(color: Color) =
    when (color) {
        RED -> "Richard"
        ORANGE -> "of"
        YELLOW -> "York"
        GREEN -> "Gave"
        BLUE -> "battle"
        INDIGO -> "In"
        VIOLET -> "Vain"
    }


fun sum(a: Double, b: Double): Double {
    return a + b
}

fun testIf(a: Int, b: Int) = if (a > b) a else b