
/*
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
*/

fun maximumProduct(nums: IntArray): Int {
    var firstMin = Int.MAX_VALUE
    var secondMin = Int.MAX_VALUE
    var firstMax = Int.MIN_VALUE
    var secondMax = Int.MIN_VALUE
    var thirdMax = Int.MIN_VALUE
        
    for (num in nums) {
        if (num <= firstMin) {
            secondMin = firstMin
            firstMin = num
        } else if (num < secondMin) secondMin = num
            
        if (num >= firstMax) {
            thirdMax = secondMax
            secondMax = firstMax
            firstMax = num
        } else {
            if (num >= secondMax) {
                thirdMax = secondMax
                secondMax = num
            } else if (num > thirdMax) thirdMax = num
        }
    }
        
    return maxOf(firstMin * secondMin * firstMax, firstMax * secondMax * thirdMax)
}