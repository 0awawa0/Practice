
/*
You are given two 0-indexed integer arrays nums1 and nums2, both of length n.

You can choose two integers left and right where 0 <= left <= right < n and swap the subarray nums1[left...right] with the subarray nums2[left...right].

You may choose to apply the mentioned operation once or not do anything.

The score of the arrays is the maximum of sum(nums1) and sum(nums2), where sum(arr) is the sum of all the elements in the array arr.

Return the maximum possible score.
*/


fun maximumsSplicedArray(nums1: IntArray, nums2: IntArray): Int {
        
    var firstTotal = nums1.sum()
    var firstSum = 0
    var firstMax = 0
    for (i in nums1.indices) {
        firstSum = maxOf(nums2[i] - nums1[i], firstSum + nums2[i] - nums1[i])
        firstMax = maxOf(firstSum, firstMax)
    }
    
    var secondTotal = nums2.sum()
    var secondSum = 0
    var secondMax = 0
    for (i in nums2.indices) {
        secondSum = maxOf(nums1[i] - nums2[i], secondSum + nums1[i] - nums2[i])
        secondMax = maxOf(secondMax, secondSum)
    }
    
    
    return maxOf(firstTotal + firstMax, secondTotal + secondMax)
}