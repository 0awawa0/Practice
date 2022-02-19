/*
You are given an array nums of n positive integers.

You can perform two types of operations on any element of the array any number of times:

    If the element is even, divide it by 2.
        For example, if the array is [1,2,3,4], then you can do this operation on the last element, and the array will be [1,2,3,2].
    If the element is odd, multiply it by 2.
        For example, if the array is [1,2,3,4], then you can do this operation on the first element, and the array will be [2,2,3,4].

The deviation of the array is the maximum difference between any two elements in the array.

Return the minimum deviation the array can have after performing some number of operations.
*/

fun minimumDeviation(nums: IntArray): Int {
  val tree = TreeSet<Int>()
        
  for (number in nums) {
    if (number % 2 == 0) tree.add(number)
    else tree.add(number * 2)
  }
        
  var minimum = tree.last() - tree.first()
  while (tree.isNotEmpty() && tree.last() % 2 == 0) {
    val max = tree.last()
    tree.remove(max)
    tree.add(max / 2)
            
    minimum = minOf(minimum, tree.last() - tree.first())
  }
        
  return minimum
}
