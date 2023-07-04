package level3.clazz

class Collection {
}

fun main(args: Array<String>) {

    println(arrayListOf(1,5,20))
    println(hashMapOf(1 to "one", 2 to "tow", 3 to "three"))
    println(listOf("first", "second", "fourteenth").last())
    println(setOf(1, 20, 5, 1))

    val list = listOf(1, 2, 3)
    println(joinToString(list, "; ", "(", ")"))

}

fun joinToString(
    collection: List<Int>,
    separator: String,
    prefix: String,
    postfix: String
): String{
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()){
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}