
/*
You are given two positive integer arrays nums and numsDivide. You can delete any number of elements from nums.

Return the minimum number of deletions such that the smallest element in nums divides all the elements of numsDivide. If this is not possible, return -1.

Note that an integer x divides y if y % x == 0.
*/

fun minOperations(nums: IntArray, numsDivide: IntArray): Int {
    nums.sort()
    
    var g = numsDivide[0]
    for (num in numsDivide) g = gcd(num, g)
    
    for (i in nums.indices) if (g % nums[i] == 0) return i
    return -1
}

private fun gcd(num1: Int, num2: Int): Int {
    var a = minOf(num1, num2)
    var b = maxOf(num1, num2)
    while (a != 0) {
        val t = a
        a = b % a
        b = t
    }
    return b
}