
/*
You are given an integer array nums and an integer k.

In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.

Return the maximum number of operations you can perform on the array.
*/

fun maxOperations(nums: IntArray, k: Int): Int {
    val map = HashMap<Int, Int>()
    var count = 0
    for (number in nums) {
        val t = k - number
        if ((map[t] ?: 0) > 0) {
            count++
            map[t] = (map[t] ?: 1) - 1
        } else map[number] = (map[number] ?: 0) + 1
    }
        
    return count
}