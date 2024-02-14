package SW06

import kotlin.math.PI

fun degreesToRadians(degrees: Double): Double {
    return degrees * PI / 180;
}

fun main() {
    println(degreesToRadians(360.0) == PI * 2)
}