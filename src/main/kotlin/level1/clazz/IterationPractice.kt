package level1.clazz

import java.util.*

class IterationPractice {
}

fun main(args: Array<String>) {

    for (i in 1..100){
        print(fizzBuzz(i))
    }

    println("")
    println("")

    for (i in 100 downTo 1 step 2){
        print(fizzBuzz(i))
    }

    println("")
    println("")

    val binaryReps = TreeMap<Char, String>()
    println("binaryReps : $binaryReps")

    for (c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.toInt())
        println("binary : $binary")
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps){
        print("$letter = $binary , ")
    }

    println("")
    println("")

    val list = arrayListOf("10", "11", "1111")
    for ((index, element) in list.withIndex()){
        println("$index: $element")
    }

    println(recognize('A'))
    println("Kotlin" in "Java".."Scala")

}

fun recognize(c: Char) = when(c){
    in '0'..'9' -> "it's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know.."
}

fun fizzBuzz(i : Int) = when{
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "

}