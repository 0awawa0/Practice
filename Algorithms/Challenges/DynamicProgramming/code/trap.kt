
/*
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
*/

fun trap(height: IntArray): Int {
    if (height.isEmpty()) return 0
    var leftMax = 0
    var rightMax = 0
    var result = 0
    var left = 0
    var right = height.lastIndex
    while (left < right) {
        if (height[left] < height[right]) {
            if (height[left] >= leftMax) leftMax = height[left]
            else result += leftMax - height[left]
            left++
        } else {
            if (height[right] >= rightMax) rightMax = height[right]
            else result += rightMax - height[right]
            right--
        }
    }
    return result
}