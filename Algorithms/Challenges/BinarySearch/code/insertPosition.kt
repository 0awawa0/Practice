/*
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
*/


fun searchInsert(nums: IntArray, target: Int): Int {
    if (target <= nums[0]) return 0
    if (target > nums[nums.size - 1]) return nums.size
        
    var l = 0
    var r = nums.size - 1
    var mid = (r + l) / 2
        
    while (r - l > 1) {
        if (nums[mid] == target) { return mid }
            
        if (nums[mid] > target) r = mid 
        else l = mid
            
        mid = (r + l) / 2
    }
        
    return mid + 1
}

fun main(args: Array<String>) {
    print("Enter nums array >> ")
    val nums = readLine()!!.split(",").map { it.toInt() }.toIntArray()
    print("Enter target >> ")
    val target = readLine()!!.toInt()
    println("Insert position: ${searchInsert(nums, target)}")
}
