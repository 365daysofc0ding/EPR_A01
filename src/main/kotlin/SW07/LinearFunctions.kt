package SW07

fun f(x: Int) = 3 * x - 2

fun printValueTable(startX: Int, endX: Int) {
    println("Value table from $startX to $endX")
    for (x in startX until (endX + 1)) {
        println("($x|${f(x)})")
    }
}

fun main() {
    printValueTable(0, 5)
}