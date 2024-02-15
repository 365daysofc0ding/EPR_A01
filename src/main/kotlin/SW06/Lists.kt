package SW06

fun main() {
    val temperatures = listOf(12, 8, 9, 15) // immutable list
//    val temperature1 = 12
//    val temperature2 = 8
//    val temperature3 = 9
//    val temperature4 = 15
    println(temperatures)
    println(temperatures.size)
    println(temperatures.get(2)) // gets element at index 2
    println(temperatures[2]) // different notation to get an element
    println(temperatures.sum()) // adds up all elements inside of list

    for (temperature in temperatures) {
        println("Temperature is $temperature")
    }

    val mutableList = mutableListOf(12.3, 44.5, 33.2, 44.5) // automatic type inference
    println(mutableList)
    mutableList.add(11.1)
    //  mutableList += 12.2 also adds an element to list
    println(mutableList)
    mutableList.remove(44.5) // removes first element
    //  mutableList += 12.2 also removes an element from list
    println(mutableList)
    mutableList.removeAt(1)
    println(mutableList)
    mutableList.sort()
    println(mutableList)

    // implement iterator that removes all elements that are equal to 44.5
    // use .remove(listOf(44.5))
}