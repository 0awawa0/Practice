
/*
Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers. Return the maximum product you can get.
*/

fun integerBreak(n: Int): Int {
    if (n == 2) return 1
    if (n == 3) return 2
        
    var prod = 1
    var num = n
    while (num > 4) {
        prod *= 3
        num -= 3
    }
        
    prod *= num
    return prod
}