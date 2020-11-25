
/*
Given an array of integers nums.

A pair (i,j) is called good if nums[i] == nums[j] and i < j.

Return the number of good pairs.
*/

fun numIdenticalPairs(nums: IntArray): Int {
    var nums = nums.sorted() // O(N * logN)
    var count = 0
    var i = 0
    
    // O(n)
    while (i < nums.size) {
        var t = nums[i]
        var tC = 0
        while (nums[i] == t) {
            tC += 1
            i += 1
            if (i >= nums.size) break
        }
        count += tC * (tC - 1) / 2
    }
    
    return count
}

fun main(args: Array<String>) {
    print("Enter array of integers >> ")
    val nums = readLine()!!.split(',').map { it.toInt() }.toIntArray()
    println("Count of identical pairs: ${numIdenticalPairs(nums)}")
}
