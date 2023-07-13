package level3.clazz

class Collection {
}

class User(val id: Int, val name: String, val address: String)

const val TEST = "abc"

fun main(args: Array<String>) {

    println(arrayListOf(1,5,20))
    println(hashMapOf(1 to "one", 2 to "tow", 3 to "three"))
    println(listOf("first", "second", "fourteenth").last())
    println(setOf(1, 20, 5, 1))

    val list = listOf(1, 2, 3)
//    println(joinToString(list, "; ", "(", ")"))
    println(joinToString(list, ))
    println(TEST)


    parsePath("/Users/toywar/kotlin-test/chapter.txt")

    saveUser(User(1, "toywar94", "address"))

    val list2 = mutableListOf(1,2,3)
    list2.swap(1,2)
    println("swap: $list2")

}

fun saveUser(user: User){
    user.validateBeforeSave(user)
}

fun MutableList<Int>.swap(index1: Int, index2: Int){
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}


fun User.validateBeforeSave(user : User){
    fun validate(value: String, fieldName: String){
        if (value.isEmpty()){
            throw IllegalArgumentException(
                "Can't save user ${user.id}: empty $fieldName"
            )
        }
    }

    validate(name, "Name")
    validate(address, "Address")
}

fun parsePath(path: String){
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfter("/")
    val fileName = fullName.substringBefore(".")
    val extension = fullName.substringAfterLast(".")
    println("fullName: $fullName")
    println("Dir: $directory, name: $fileName, ext: $extension")
}


fun joinToString(
    collection: List<Int>,
    separator: String = "; ",
    prefix: String = "(",
    postfix: String = ")"
): String{
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()){

        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}