
/*
Given a positive integer n, you can apply one of the following operations:

    If n is even, replace n with n / 2.
    If n is odd, replace n with either n + 1 or n - 1.

Return the minimum number of operations needed for n to become 1.
*/

fun integerReplacement(n: Int): Int {
    var steps = 0
    var number = n.toLong()
    while (number != 1L) {
        if (number % 2L == 0L) number /= 2L
        else {
            if (number == 3L || number.and(3L) == 1L) number--
            else number++
        }
        steps++
    }
    return steps
}