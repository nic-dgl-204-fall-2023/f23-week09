/*
 * Course: DGL 204 - Programming for mobile app development
 * Author: Ashley Blacquiere
 *
 * Week 9 content, including first class functions, higher order functions, side effects and referential transparency
 */

fun main() {

    val intList = listOf(1, 2, 3, 4, 5)

    val doubledListAgain = intList.map { value ->
        if (value != intList.last()) print("$value, ") else println("$value") // A side effect!
        value * 2
    }

    println(doubledListAgain)
}

// Side effects are an expected component of OOP! So they're not inherently bad...
// However, they are not desirable in a purely functional paradigm
// And... arguably, the fewer side effects, the easier your code is to debug - so even in OOP code, it *can* be useful
// to write functions without side effect (or, at least, write your functions to be as compact as possible!)

fun addNewUser(userName: String, password: String)  {
    val newUser = Pair(userName, password)
    addUser(newUser)
}

fun addUser(user: Pair<String, String>) {
    //...
}

fun trackScore() {
    var score = 0
    score += 1
    print(score) // This is clearly a side effect
}


fun handlePlayerChange(currentPlayer: Int): Int {
    val player: Int
    player = if (currentPlayer == 1) 2 else 1
    return player
}
