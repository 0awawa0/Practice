
/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.
*/

fun sortColors(nums: IntArray): Unit {
    var redPointer = 0
    var whitePointer = 0
    var bluePointer = nums.lastIndex
    while (whitePointer <= bluePointer) {
        when (nums[whitePointer]) {
            0 -> nums.swap(redPointer++, whitePointer++)
            1 -> whitePointer++
            2 -> nums.swap(whitePointer, bluePointer--)
        }
    }
}

fun IntArray.swap(i: Int, j: Int) {
    val t = this[i]
    this[i] = this[j]
    this[j] = t
}