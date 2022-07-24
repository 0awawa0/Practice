
/*
You are given an integer array nums and you have to return a new counts array. The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].
*/

fun countSmaller(nums: IntArray): List<Int> {
    if (nums.isEmpty()) return emptyList()
    
    val result = IntArray(nums.size) { 0 }
    
    val numsCopy = Array<Pair<Int, Int>>(nums.size) { Pair(it, nums[it]) }
    
    fun mergeSortWithCounting(left: Int, right: Int) {
        if (left >= right) return
        
        val middle = left + (right - left) / 2
        mergeSortWithCounting(left, middle)
        mergeSortWithCounting(middle + 1, right)
        
        var leftIdx = left
        var rightIdx = middle + 1
        
        val merged = LinkedList<Pair<Int, Int>>()
        var count = 0
        while (leftIdx < middle + 1 && rightIdx <= right) {
            if (numsCopy[leftIdx].second > numsCopy[rightIdx].second) {
                count++
                merged.add(numsCopy[rightIdx++])
            } else {
                result[numsCopy[leftIdx].first] += count
                merged.add(numsCopy[leftIdx++])
            }
        }
        
        while (leftIdx < middle + 1) {
            result[numsCopy[leftIdx].first] += count
            merged.add(numsCopy[leftIdx++])
        }
        
        while (rightIdx <= right) merged.add(numsCopy[rightIdx++])
        
        var idx = left
        for (num in merged) numsCopy[idx++] = num
    }
    
    mergeSortWithCounting(0, numsCopy.lastIndex)
    
    return result.toList()
}