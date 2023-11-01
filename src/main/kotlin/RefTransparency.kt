/*
 * Course: DGL 204 - Programming for mobile app development
 * Author: Ashley Blacquiere
 *
 * Week 9 content, including first class functions, higher order functions, side effects and referential transparency
 */

fun main() {

    var global = 1

    fun addOne(x: Int): Int {
        return x + global
    }

    println("addOne: ${addOne(1)}")
    global += 1
    println("addOne: ${addOne(1)}")


    fun randomResult(x: Double): Double {
        return x + Math.random()
    }

    println("randomResult(100): ${randomResult(.5)}")
}

