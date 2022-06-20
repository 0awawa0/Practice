
/*
An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return the nth ugly number.
*/

fun nthUglyNumber(n: Int): Int {
    val sequence = IntArray(n) { 1 }
    var pointer2 = 0
    var pointer3 = 0
    var pointer5 = 0
    var factor2 = 2
    var factor3 = 3
    var factor5 = 5
    for (i in 1 until n) {
        val next = minOf(minOf(factor2, factor3), factor5)
        sequence[i] = next
        if (factor2 == next) factor2 = 2 * sequence[++pointer2]
        if (factor3 == next) factor3 = 3 * sequence[++pointer3]
        if (factor5 == next) factor5 = 5 * sequence[++pointer5]
    }
    return sequence.last()
}