package level4

// 주 생성자
class User(val nickName: String)

class User1 constructor(_nickName:String){
    val nickName: String = _nickName

//    val nickName: String
//
//    init {
//        nickName = _nickName;
//    }
}

class User2(
    val nickName: String,
    val isSubscribed: Boolean = true
)

class User3(val name: String){
    var address: String = "unspecified"
        set(value: String){
            println("""
                Address aws changed for $name:
                "$field" -> "$value"
            """.trimIndent())
            field = value
        }
}

class LengthCounter{
    var counter: Int = 0
        private set

    fun addWord(word: String){
        counter += word.length
    }

}


fun main(args: Array<String>) {
    val name = User2("minjae")
    println(name.isSubscribed)

    val gye = User2("minjae", false)
    println(gye.isSubscribed)

    val gye2 = User2("minjae", isSubscribed = true)
    println(gye2.isSubscribed)

    val user = User3("minjae")
    user.address = "busan"

    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!!")


    println(lengthCounter.counter)
//    println(lengthCounter.counter = 10) ex


    println("abc" === "abc")
    println("abc" == "abc")




}