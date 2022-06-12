
/*
You are given an array of positive integers nums and want to erase a subarray containing unique elements. The score you get by erasing the subarray is equal to the sum of its elements.

Return the maximum score you can get by erasing exactly one subarray.

An array b is called to be a subarray of a if it forms a contiguous subsequence of a, that is, if it is equal to a[l],a[l+1],...,a[r] for some (l,r).
*/

fun maximumUniqueSubarray(nums: IntArray): Int {
    val seen = HashSet<Int>()
        
    var currSum = 0
    var left = 0
    var right = 0
    var result = 0
    while(left < nums.size && right < nums.size) {
        if (nums[right] !in seen) {
            currSum += nums[right]
            result = maxOf(currSum, result)
            seen.add(nums[right++])
        } else {
            currSum -= nums[left]
            seen.remove(nums[left++])
        }
    }
        
    return result
}