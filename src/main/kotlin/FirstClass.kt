/*
 * Course: DGL 204 - Programming for mobile app development
 * Author: Ashley Blacquiere
 *
 * Week 9 content, including first class functions, higher order functions, side effects and referential transparency
 */
fun main() {

    val intList = listOf(1, 2, 3, 4, 5)
    println("Original intList: $intList")

    // Functions inside the curly braces are lambdas, or anonymous functions!
    // This syntax is called 'trailing function', or 'trailing lambda' syntax, and is used to improve readability.
    intList.filter { it > 3 }
    intList.reduce { acc, i -> i + acc }
    intList.fold(0) { acc, i -> i + acc }

    // A typical function declaration uses curly braces to contain the code block of the function's operation.
    // Using curly braces in trailing function syntax helps replicate this more familiar syntax and reduces the number of layered parentheses and braces
    fun newFunction(number: Int, name: String): String {
        //...
        return ""
    }

    // Doubling the values of intList using map:
    val doubledList = intList.map { it * 2 }
    println("Doubled intList via map(): $doubledList")


    // Double the values of intList using map with the lambda written in more detail:
    val doubledListAgain = intList.map { value ->
        if (value != intList.last()) print("$value, ") else println("$value") // A side effect!
        value * 2
    }
    println("Doubled intList via detailed map: $doubledListAgain")

    // Double the values of intList using a named double function, rather than a lambda:
    val doubledListOneMoreTime = intList.map { double(it) }
    println("Doubled intList via double(): $doubledListOneMoreTime")

    // Double the values of intList using a custom map function and double rather than a lambda:
    val doubledListISwearThisIsTheLastOne = m_map(intList, ::double)
    println("Doubled intList via m_map() and double(): $doubledListISwearThisIsTheLastOne")

    //And just for confirmation - intList did not change!
    println("intList: $intList")

}

fun double(number: Int): Int {
    return number * 2
}

fun m_map(list: List<Int>, operation: (number: Int) -> Int): List<Int> {
    val tempList = mutableListOf<Int>()
    for (number in list) {
        tempList.add(operation(number))
    }
    return tempList.toList()
}
