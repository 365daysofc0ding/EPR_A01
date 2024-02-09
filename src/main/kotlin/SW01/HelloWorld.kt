package SW01

fun main() {

    println("Hello World")
    var number = 0
    number++
    println(number)

    val numbers = arrayOf(2, 0, 1)
    numbers.sort();
    for(number in numbers) {
        println(number)
    }

    fun sum(a: Int, b: Int) = a + b

    println(sum(2, 4))
}