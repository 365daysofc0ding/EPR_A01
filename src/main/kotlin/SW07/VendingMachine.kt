package SW07

val QUIT = 0
val INSERT_COINS = 1
val COFFEE = 2
val HOT_CHOCOLATE = 3
val TEA = 4
val CHANGE = 5

val COFFEE_PRICE = 1.0
val HOT_CHOCOLATE_PRICE = 1.1
val TEA_PRICE = 0.8

var COINS = listOf(0.1, 0.2, 0.5, 1.00, 2.00, 2.50)

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

fun printValidCoins() {
    for (coin in COINS) {
        println(coin)
    }
}

fun insert(coin: Double) {
    if (COINS.contains(coin)) {
        credit += coin
        credit = "%.2f".format(credit).toDouble()
        println("Credits available: $credit")
    }
    else {
        println("Please insert a valid coin")
    }
}

fun refund() {
    println("Total credit to be refunded: $credit ")
    for (coin in COINS.asReversed()) {
        while (credit >= coin) {
            credit -= coin;
            println("$coin change")
            credit = "%.2f".format(credit).toDouble()
        }
    }
}

fun correct(price: Double) {
    credit -= price
    credit = "%.2f".format(credit).toDouble()
}

fun makeCoffee() {
    if (hasEnoughWater && hasEnoughCredit(COFFEE_PRICE)) {
        println("Enjoy your coffee")
        correct(COFFEE_PRICE)
        println("Credits left $credit")
        waterLevel -= CUP_SIZE
        println("Remaining water in machine $waterLevel")
        if (waterLevel < MIN_WATERLEVEL) {
            refill(1000)
        }
    } else {
        println("Not enough credit left for a coffee")
    }
}

fun makeHotChocolate() {
    if (hasEnoughCredit(HOT_CHOCOLATE_PRICE)) {
        println("Enjoy your hot chocolate")
        correct(HOT_CHOCOLATE_PRICE)
        println("Credits left $credit")
    } else {
        println("Not enough credit left for a hot chocolate")
    }
}

fun makeTea() {
    if (hasEnoughWater && hasEnoughCredit(TEA_PRICE)) {
        println("Enjoy your tea")
        correct(TEA_PRICE)
        println("Credits left $credit")
        waterLevel -= CUP_SIZE
        println("Remaining water in machine $waterLevel")
        if (waterLevel < MIN_WATERLEVEL) {
            refill(1000)
        }
    } else {
        println("Not enough credit left for a tea")
    }
}

fun main() {
    printMenu()
    do {
        option = readln().toInt()
        when (option) {
            INSERT_COINS -> {
                do {
                    println("Please insert your coins")
                    println("The following coins are valid")

                    printValidCoins()

                    var doneInserting = false
                    val coin = readln().toDouble()

                    insert(coin)

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

                println("Choose your drink now, change or quit")
            }

            COFFEE -> {
                makeCoffee()
            }

            HOT_CHOCOLATE -> {
                makeHotChocolate()
            }

            TEA -> {
                makeTea()
            }

            CHANGE -> {
                refund()
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