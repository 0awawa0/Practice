
/*
You are given an integer n. We reorder the digits in any order (including the original order) such that the leading digit is not zero.

Return true if and only if we can do this so that the resulting number is a power of two.
*/

fun reorderedPowerOf2(n: Int): Boolean {
    val nCounts = countDigits(n)
    for (i in 0..30) {
        if (nCounts.contentEquals(countDigits(1.shl(i)))) return true
    }
    return false
}

private fun countDigits(number: Int): IntArray {
    val result = IntArray(10)
    var n = number
    while (n > 0) {
        result[n % 10]++
        n /= 10
    }
    return result
}