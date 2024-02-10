package SW05

fun main() {
    for (counter in 1..3) {
        println("Number $counter")
    }

    var i = 0
    while (i < 10) {
        println("My counter: $i")
        i++
    }
    println("Done")

    i = 0

    do {
        println("My counter: $i")
        i++
    } while (i < 10)

    repeat(3) {
        println("Number $it")
    }
}