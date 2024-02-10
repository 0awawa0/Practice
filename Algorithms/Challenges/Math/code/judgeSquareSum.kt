/*
Given a non-negative integer c, decide whether there're two integers a and b such that a^2 + b^2 = c.
*/
import kotlin.math.*


fun judgeSquareSum(c: Int): Boolean {
    var number = c
    val root = sqrt(number.toDouble()).toInt() + 1
    for (i in 2..root) {
        var counter = 0
        while (number % i == 0) {
            number = number / i
            counter++
        }
        if (i % 4 == 3 && counter % 2 != 0) return false
        if (number < i) return number % 4 != 3
    }
    return number % 4 != 3
}
