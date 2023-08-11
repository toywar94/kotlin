package level6

import java.lang.IllegalArgumentException


class Test {
}
data class Address(val streetAddress: String, val zipCode: Int,
              val city: String, val country: String)
data class Company(val name: String, val address: Address?)
data class Person(val name:String, val company: Company?)

fun main(args: Array<String>) {

    val x: String? = null
    println(strLen("abc"))
    println(strLen(null))

    val person = Person("Dmitry", null)
    println(person.countryName())

    val address = Address("Elsestr",8080,"Munich", "germany")
    val jetbrains = Company("Jetbrain", address)
    val person1 = Person("dmitry", jetbrains)
    println(printShippingLabel(person1))
//    println(printShippingLabel(Person("aaaa", null)))

    val email: String? = "abc"
//    val email: String? = null
//    sendEmailTo(email)
    email?.let { sendEmailTo(it) }

}

fun sendEmailTo(email: String){
    println("send to email : $email")
}

fun printShippingLabel(person: Person){
    val address = person.company?.address
        ?: throw IllegalArgumentException("No address")
    with(address){
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}

fun Person.countryName(): String =
    this.company?.address?.country?: "Unknown"

fun strLen(s: String?): Int = s?.length ?: 0

