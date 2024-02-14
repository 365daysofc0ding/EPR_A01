package SW05

val QUIT = 0
val INSERT_COINS = 1
val COFFEE = 2
val HOT_CHOCOLATE = 3
val TEA = 4
val CHANGE = 5

val COFFEE_PRICE = 1.0
val HOT_CHOCOLATE_PRICE = 1.1
val TEA_PRICE = 0.8

var option = 0
var waterLevel = 1000.0
val MIN_WATERLEVEL = 200.0
val CUP_SIZE = MIN_WATERLEVEL
var credit = 0.0
var hasEnoughWater = true

fun hasEnoughCredit(price: Double): Boolean = credit >= price
fun refill(amount: Int) {
    waterLevel += amount
}

fun printMenu() {
    println("----------- MENU -----------")
    println("Insert coins...............$INSERT_COINS")
    println("Coffee (${COFFEE_PRICE}0)..............$COFFEE")
    println("Hot chocolate (${HOT_CHOCOLATE_PRICE}0 CHF)...$HOT_CHOCOLATE")
    println("Tea (${TEA_PRICE}0 CHF).............$TEA")
    println("Change.....................$CHANGE")
    println("Quit.......................$QUIT")
    println("----------------------------")
    print("Choose an option")
}

fun main() {
    printMenu()
    do {
        option = readln().toInt()
        when (option) {
            INSERT_COINS -> {
                do {
                    print("Please insert your coins")

                    var doneInserting = false
                    val coin = readln().toDouble()

                    if (coin == 0.1 ||
                        coin == 0.2 ||
                        coin == 0.5 ||
                        coin == 1.0 ||
                        coin == 2.0 ||
                        coin == 5.0) {
                        credit += coin
                        credit = "%.2f".format(credit).toDouble() // subtraction isn't 100% accurate, this is a fix to round to two decimal places
                        println("Credits available: $credit")
                    }
                    else {
                        println("Only the following coins exist: 0.1, 0.2, 0.5, 1.0, 2.0, 5.0")
                    }

                    println("Do you want to insert more coins? (y/n)")

                    val userInput = readln()

                    when {
                        (userInput == "y") -> {
                            continue
                        }

                        (userInput == "n") -> {
                            doneInserting = true
                        }
                    }

                } while (!doneInserting)

                println("Choose your drink now")
            }

            COFFEE -> {
                if (hasEnoughWater && hasEnoughCredit(COFFEE_PRICE)) {
                    println("Enjoy your coffee")
                    credit -= COFFEE_PRICE
                    credit = "%.2f".format(credit).toDouble()
                    println("Credits left $credit")
                    waterLevel -= CUP_SIZE
                    println("Remaining water in machine $waterLevel")
                    if (waterLevel < MIN_WATERLEVEL) {
                        refill(1000)
                    }
                } else {
                    if(!hasEnoughWater)
                        println("Not enough water left for a coffee")
                    if(!hasEnoughCredit(COFFEE_PRICE))
                        println("Not enough credit left for a coffee")
                }
            }

            HOT_CHOCOLATE -> {
                if (hasEnoughCredit(HOT_CHOCOLATE_PRICE)) {
                    println("Enjoy your hot chocolate")
                    credit -= HOT_CHOCOLATE_PRICE
                    credit = "%.2f".format(credit).toDouble()
                    println("Credits left $credit")
                } else {
                    println("Not enough credit left for a hot chocolate")
                }
            }

            TEA -> {
                if (hasEnoughWater && hasEnoughCredit(TEA_PRICE)) {
                    println("Enjoy your tea")
                    credit -= TEA_PRICE
                    credit = "%.2f".format(credit).toDouble()
                    println("Credits left $credit")
                    waterLevel -= CUP_SIZE
                    println("Remaining water in machine $waterLevel")
                    if (waterLevel < MIN_WATERLEVEL) {
                        refill(1000)
                    }
                } else {
                    if(!hasEnoughWater)
                        println("Not enough water left for a tea")
                    if(!hasEnoughCredit(TEA_PRICE))
                        println("Not enough credit left for a tea")
                }
            }

            CHANGE -> {
                if(credit > 0) {
                    println(credit)
                    credit = 0.0
                }
            }

            QUIT -> {
                println("Bye bye!")
            }

            else -> {
                println("Invalid option")
            }
        }
    } while (option != QUIT)
}