/*
Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.

An integer a is closer to x than an integer b if:

    |a - x| < |b - x|, or
    |a - x| == |b - x| and a < b

*/


fun findClosestElements(arr: IntArray, k: Int, x: Int): List<Int> {
	
    // If k equals to size of an array, we don't have to do anything. Just return array back
    if (k == arr.size) return arr.toList()
       
    val result = LinkedList<Int>()
        
		// Try find x in the array with binary search
    val index = tryFindX(x, arr)
		
    var left = index - 1
    var right = index
        
		// Make sure that left and right point to valid indices
    if (left < 0) {
        left++
        right++
    }
        
    while (result.size < k) {
		
		    // If left pointer became invalid, add elements from the right pointer
        if (left < 0) {
            result.addLast(arr[right++])
            continue
        } 
            
			  // If right pointer became invalid, add elements from the left pointer
        if (right >= arr.size) {
            result.addFirst(arr[left--])
            continue
        }
            
        // Pick closest element between left and right and adjust the pointer
		    // Note that you must add elements from left pointer to head of the list
		    // and elements from right pointer to tail in order for result to remain sorted.
        if (closer(x, arr[left], arr[right])) 
				    result.addFirst(arr[left--])
        else 
				    result.addLast(arr[right++])
    }
        
    return result
}
	
// Standard binary search
fun tryFindX(x: Int, arr: IntArray): Int {
    var left = 0
    var right = arr.size - 1
    var middle = (left + (right - left) / 2).toInt()
    while (left < right) {
        if (x == arr[middle]) return middle
        if (x > arr[middle]) left = middle + 1
        else right = middle - 1
        middle = (left + (right - left) / 2).toInt()
    }
        
		// Here we either return the index of x, or the index of the element which is
		// pretty close to x (but not always closest).
		// Note that the closest element might be on index middle - 1, that's why we
		// set left pointer to index - 1.
    return middle
}
    
// Just a helper function to determine if a is closer to x than b.
fun closer(x: Int, a: Int, b: Int): Boolean {
    val absA = abs(a - x)
    val absB = abs(b - x)
    return absA < absB || absA == absB
}
