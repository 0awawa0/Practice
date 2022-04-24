
/*
Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays. Return the sum of all odd-length subarrays of arr.
*/

fun sumOddLengthSubarrays(arr: IntArray): Int {
  var totalSum = 0
  for (i in 0 until arr.size) {
    val endsAtI = i + 1
    val startsAtI = arr.size - i
    val totalArrays = startsAtI * endsAtI
    val oddArrays = if (totalArrays % 2 == 0) totalArrays / 2 else totalArrays / 2 + 1
    totalSum += oddArrays * arr[i]
  }
        
  return totalSum
}
