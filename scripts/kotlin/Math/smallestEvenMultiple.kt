
/*
Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.
*/

fun smallestEvenMultiple(n: Int): Int {
    return (2 * n) / gcd(2, n)
}

private fun gcd(a: Int, b: Int): Int {
    if (b == 0) return a
    return gcd(b, a % b)
}