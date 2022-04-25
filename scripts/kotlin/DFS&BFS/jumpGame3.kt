
/*
Given an array of non-negative integers arr, you are initially positioned at start index of the array. When you are at index i, you can jump to i + arr[i] or i - arr[i], check if you can reach to any index with value 0.

Notice that you can not jump outside of the array at any time.
*/

fun canReach(arr: IntArray, start: Int): Boolean {
    val reached = BooleanArray(arr.size) { false }
        
    val queue = LinkedList<Int>()
    queue.add(start)
        
    while (queue.isNotEmpty()) {
            
        val index = queue.poll()
        if (arr[index] == 0) return true
        if (reached[index]) continue
            
        reached[index] = true
        val distance = arr[index]
        if (index + distance < arr.size) queue.add(index + distance)
        if (index - distance >= 0) queue.add(index - distance)
    }
        
    return false
}