package SW02

fun main() {

    var number = 7
    var floatingPoint = 12.9
    var name = "Lars"
    val hasDriversLicense = true

    println(number)
    println(floatingPoint)
    println(name)
    println(hasDriversLicense)

    number = floatingPoint.toInt() // truncates floating point number

    println(number)
}