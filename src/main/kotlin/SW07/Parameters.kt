package SW07

fun rechneStrom(spannungV: Double, widerstandOhm: Double): Double {
    println("Funktion wird ausgeführt")
    return spannungV / widerstandOhm
}

fun main() {
    var spannungV = 12.0
    var widerstandOhm = 100.0
    var stromA = rechneStrom(spannungV, widerstandOhm)

    println("Strom $stromA A")
}