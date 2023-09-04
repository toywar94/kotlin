package level7


class level7 {
}

data class Test(val x: Int, val y: Int)



fun main(args: Array<String>) {
    val p = Test(10,20)
    println("p :${p}")

    val(a,b) = p
    println("a : ${a}")
    println("b : ${b}")
}