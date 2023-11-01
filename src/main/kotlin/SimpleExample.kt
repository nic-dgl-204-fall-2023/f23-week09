/*
 * Course: DGL 204 - Programming for mobile app development
 * Author: Ashley Blacquiere
 *
 * Week 9 content, including first class functions, higher order functions, side effects and referential transparency
 */

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    var newList = listOf<Int>()

    if (!list.isEmpty()) {
        newList = list.filter { it > 2 }
    }
    println("newList: $newList")

    val newestList = list.filter { it ->
        if (it < 3) println("Rejected value: $it")
        it > 2
    }
    println("newestList: $newestList")
}