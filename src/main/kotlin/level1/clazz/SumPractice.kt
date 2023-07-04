package level1.clazz

import java.lang.IllegalArgumentException

interface Expr
class SumPractice(val left: Expr, val right: Expr) : Expr
class NumPractice(val value: Int) : Expr

fun main(args: Array<String>) {

    // is -> instanceof
    println(eval(SumPractice(SumPractice(NumPractice(1), NumPractice(2)),NumPractice(1))))

    // to kotlin
    println(eval2(SumPractice(NumPractice(5),NumPractice(3))))
}

fun eval(e: Expr) : Int{
    if (e is NumPractice){
        val n = e as NumPractice
        return n.value
    }
    if (e is SumPractice){
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun eval2(e: Expr) : Int =
   when(e){
       is NumPractice -> {
           println("NumPractice ${e.value}")
           e.value
       }
       is SumPractice -> {
           println("NumPractice ${e.right} , ${e.left}")
           eval2(e.right) + eval2(e.left)
       }
       else -> throw IllegalArgumentException("Unknown expression")
   }
