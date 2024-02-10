package SW03

import kotlin.math.*

fun main() {

    val length = 4
    val width = 3
    val rectanglePerimeter = 2 * (length + width)
    println(rectanglePerimeter)

    val radius = 5.0
    val circleArea = radius.pow(2) * PI
    println(circleArea)
    println(round(circleArea))

    println(10.0 / 3.0)
    println(10 / 3) // no fraction
    println(10 / 3.0) // if one of the two numbers is a double it'll result in a double
    println(10 % 3) // returns the remainder of a division

    val number = 27.0

    println(number.pow(1.0/3)) // either 1.0/3 or 1/3.0 is necessary, because 1/3 would result in 0 and then 27.0^0 = 1.0

    val productAvailable = true
    val price = 50
    val account = 1_000

    if (productAvailable and
        (price <= account)) {
        println("Buy the product")
    } else {
        println("Can't buy the product")
    }

    val text1 = "Hello"
    val text2 = "Hello"
    println(text1 == text2)
}