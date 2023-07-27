package level4

import java.lang.IllegalArgumentException

sealed interface Expr {
    class Num(val value: Int) : Expr
    class Sum(val left: Expr, val right: Expr) : Expr
}

fun eval(e: Expr) : Int =
    when(e){
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.right) + eval(e.left)
//        else ->
//            throw IllegalArgumentException("Unknown expression")

    }

fun main(args: Array<String>) {
    println(eval(Expr.Num(1)))
    println("*************")
    println(eval(Expr.Sum(Expr.Num(1), Expr.Num(5))))

}