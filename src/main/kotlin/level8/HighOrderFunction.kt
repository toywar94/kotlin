package level8


class HighOrderFunction {
}

enum class Delivery{STANDARD, EXPEDITED}

class Order(val itemCount: Int)


fun main(args: Array<String>) {

    val sum: (Int, Int) -> Int = {x, y -> x+y}

    twoAndThree{ a, b -> a + b}
    twoAndThree{ a, b -> a * b}

    val calculator = getShippingCostCalculator(Delivery.EXPEDITED)
    println("Shipping costs ${calculator(Order(3))}")

    val calculator2 = getShippingCostCalculator(Delivery.STANDARD)
    println("Shipping costs ${calculator2(Order(3))}")


    myFunc { println("call myFunc") }
}

fun myFunc(callBack : () -> Unit){
    println("myFun start")
    callBack()
    println("myFun end")
}

fun getShippingCostCalculator(
    delivery: Delivery): (Order) -> Double{
        if (delivery == Delivery.EXPEDITED){
            return {order -> 6 + 2.1 * order.itemCount}
        }
        return{order -> 1.2 * order.itemCount}
    }



fun twoAndThree(operation: (Int, Int) -> Int){
    val result = operation(2,3)
    println("The result ${result}")
}
