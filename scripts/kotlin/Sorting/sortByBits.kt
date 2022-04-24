
/*
You are given an integer array arr. Sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of two or more integers have the same number of 1's you have to sort them in ascending order. Return the array after sorting it.
*/

fun sortByBits(arr: IntArray): IntArray {
  return arr.sortedWith(
    compareBy<Int> { it.hammingWeight() }.thenBy<Int> { it }
  ).toIntArray()
}
    
private fun Int.hammingWeight(): Int {
  var n = this
  var weight = 0
  while (n != 0) {
    if (n % 2 == 1) weight++
    n = n.shr(1)
  }
  return weight
}
