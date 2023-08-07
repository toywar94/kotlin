package level5

import level4.LengthCounter
import level4.User2
import level4.User3

class lambda {
}
fun main(args: Array<String>) {

    val naturalNumbers = generateSequence(0){it + 1}
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())


    println(alphabet())
    println("------------------------------")
    println(useWithAlphabet())
    println("------------------------------")
    println(refacAlphabet())
    println("--------------apply----------------")
    println(applyWithAlphabet())


}

fun applyWithAlphabet() = StringBuilder().apply{
    for(letter in 'A'..'Z'){
        append(letter)
    }
    append("\nNow I know the alphabet!")

}.toString()

fun alphabet(): String {

    val result = StringBuilder()
    for(letter in 'A'..'Z'){
        result.append(letter)
    }

    result.append("\nNow I know the alphabet!")
    return result.toString()

}

fun useWithAlphabet(): String{
    val stringBuilder = StringBuilder()

    return with(stringBuilder){
        for(letter in 'A'..'Z'){
            this.append(letter)
        }
        append("\nNow I know the alphabet!")
        toString()
    }
}

fun refacAlphabet() = with(StringBuilder()){
    for(letter in 'A'..'Z'){
        append(letter)
    }
    append("\nNow I know the alphabet!")
    toString()
}