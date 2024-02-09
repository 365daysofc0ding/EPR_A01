package SW04

fun main() {

    var musicGenre = "Rap"
    musicGenre = "Deep House"
    val musicPreference = "Hardstyle"
    val numberA = 5
    val numberB = 10

    println(musicPreference)

    if(musicGenre == musicPreference)
        println("Amazing")
    else
        println("Eww")

    val car = "VW Golf"

    when (car) { // switch statement in Java
        "Mercedes" -> {
            println("Refuel")
        }
        "Tesla" -> {
            println("Recharge")
        }
        "VW Golf" -> {
            println("Clean")
        }
        else -> {
            println("Unknown car")
        }
    }

    when { // else-if statement in Java
        musicGenre == "Deep House" -> {
            println("$musicGenre is playing right now")
        }
        numberA > numberB -> {
            println("$numberA is greater than $numberB")
        }
    }
}