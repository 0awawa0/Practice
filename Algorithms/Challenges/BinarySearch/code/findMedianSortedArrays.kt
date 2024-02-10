
/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
*/

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    if (nums1.size > nums2.size) return findMedianSortedArrays(nums2, nums1)
        
    var left = 0
    var right = nums1.size
    while (left <= right) {
            
        val middle1 = left + (right - left) / 2
        val middle2 = (nums1.size + nums2.size + 1) / 2 - middle1
        val left1 = if (middle1 == 0) Int.MIN_VALUE else nums1[middle1 - 1]
        val right1 = if (middle1 == nums1.size) Int.MAX_VALUE else nums1[middle1]
        val left2 = if (middle2 == 0) Int.MIN_VALUE else nums2[middle2 - 1]
        val right2 = if (middle2 == nums2.size) Int.MAX_VALUE else nums2[middle2]
            
        if (left1 <= right2 && left2 <= right1) {
            if ((nums1.size + nums2.size) % 2 == 0) return (maxOf(left1, left2) + minOf(right1, right2)) / 2.0
            else return maxOf(left1, left2).toDouble()
        }
            
        if (left1 > right2) right = middle1 - 1
        else left = middle1 + 1
    }
        
    return 0.0
}