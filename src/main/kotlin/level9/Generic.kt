package level9

class Generic {
}

interface List<T>{
    operator fun get(index: Int):T
}

//class StringList: List<String>{
//    override fun get(index: Int): String = ...
//
//}

fun main(args: Array<String>) {
//    val readers: MutableList<String> = mutableListOf()
//    val readers = mutableListOf<String>()

    val letters = ('a'..'z').toList()
    println("letters ${letters}")

    val authors = listOf("Hello", "kotlin")
    val readers = mutableListOf<String>()

    readers.filter{ it !in authors }
}

//fun <T> List<T>.filter(predicate: (T) -> Boolean): List<T>


