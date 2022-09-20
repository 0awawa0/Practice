
/*
Given two integer arrays nums1 and nums2, return the maximum length of a subarray that appears in both arrays.
*/

fun findLength(nums1: IntArray, nums2: IntArray): Int {
    var maxLength = 0
    val mem = Array<IntArray>(nums1.size + 1) { IntArray(nums2.size + 1) }
    
    for (i in nums1.lastIndex downTo 0) {
        for (j in nums2.lastIndex downTo 0) {
            if (nums1[i] == nums2[j]) {
                mem[i][j] = mem[i + 1][j + 1] + 1
                maxLength = maxOf(mem[i][j], maxLength)
            }
        }
    }
    return maxLength
}