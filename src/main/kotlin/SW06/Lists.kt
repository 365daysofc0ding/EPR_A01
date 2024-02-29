package SW06

import java.util.*

fun main() {
    var temperatures = listOf(12, 8, 9, 15) // immutable list... cannot change content or size
    println(temperatures)
    println(temperatures.size)
    println(temperatures.get(2)) // gets element at index 2
    println(temperatures[2]) // bracket notation to get an element
    println(temperatures.sum()) // adds up all elements inside of list

    for (temperature in temperatures) {
        println("Temperature is $temperature")
    }

    val mutableList = mutableListOf(12.3, 44.5, 33.2, 44.5, 44.5)
    println(mutableList)
    mutableList.add(1, 11.1) // adds at specified index and shifts other elements one position to the right
    //  mutableList += 12.2 also adds an element to list
    mutableList.set(4, 100.0)
    println(mutableList)
    // mutableList.remove(44.5) // removes first element
    //  mutableList += 12.2 also removes an element from list
    mutableList.removeAll(listOf(44.5)) // passes in a list and removes all elements
    println(mutableList)
    mutableList.removeAt(1)
    println(mutableList)
    mutableList.sort()
    println(mutableList)

    var emotions = arrayOf("Happiness", "Anger", "Sadness") // once defined arrays have a fixed size unlike JavaScript push() and pop()
    emotions[0] = "Frustration"
    println(emotions.get(0))

    var list = mutableListOf("a", "b", "c", "d")
    println(list.containsAll(listOf("b", "d")))

    list.addAll(listOf("e", "f"))

    Collections.rotate(list, -2)
    println(list)

    val workDays = mutableListOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
    val weekend = mutableListOf("Saturday", "Sunday")

    var week = mutableListOf<String>()

    week.addAll(workDays)
    week.addAll(weekend)

    println(week)

    println(122.toChar())
}