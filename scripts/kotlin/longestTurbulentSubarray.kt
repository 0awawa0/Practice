
/*
Given an integer array arr, return the length of a maximum size turbulent subarray of arr.

A subarray is turbulent if the comparison sign flips between each adjacent pair of elements in the subarray.

More formally, a subarray [arr[i], arr[i + 1], ..., arr[j]] of arr is said to be turbulent if and only if:

    For i <= k < j:
        arr[k] > arr[k + 1] when k is odd, and
        arr[k] < arr[k + 1] when k is even.
    Or, for i <= k < j:
        arr[k] > arr[k + 1] when k is even, and
        arr[k] < arr[k + 1] when k is odd.

*/

fun maxTurbulenceSize(arr: IntArray): Int {
	
  // If array size is 1, there is only 1 possible subarray.
  if (arr.size == 1) return 1
        
  // Set initial values
  var maxLength = 1
  var left = 0
  var right = 1
        
  // Skip equal values at the beginning of the array
  while (right < arr.size && arr[left] == arr[right]) left = right++
		
  // If right reached the end of the array, than the array consists of equal values
  // and the answer is 1
  if (right >= arr.size) return maxLength
        
  var isDown = arr[left] > arr[right]
        
  while (right < arr.size)  {
    if ((arr[right - 1] > arr[right] && !isDown) 
        || (arr[right - 1] < arr[right] && isDown)
    ) {
        // Case 1 and 2 - turbulence property holds
        right++
        isDown = !isDown
    } else {
        // Case 3 - turbulence property does not hold
        maxLength = maxOf(maxLength, right - left)
        if (arr[right - 1] == arr[right]) left = right++
        else left = right - 1
        if (right < arr.size) isDown = !(arr[left] > arr[right])
    }
  }
        
  return maxOf(maxLength, right - left)
}
