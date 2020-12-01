/*
Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ...,(an, bn) 
such that the sum of min(ai, bi) for all i is maximized.

Return the maximized sum.
*/

fun arrayPairSum(nums: IntArray): Int {
    var numsCopy = nums.copyOf()
    numsCopy.sort()
    var sum = 0
    for (i in 0 until numsCopy.size step 2) {
        sum += numsCopy[i]
    }
    return sum
}

fun main(args: Array<String>) {
    print("Enter numbers >> ")
    var nums = readLine()!!.split(',').map { it.toInt() }.toIntArray()
    println("Hamming distance is ${arrayPairSum(nums)}")
    print(nums.joinToString(","))
}
