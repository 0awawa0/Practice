
/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
*/

fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
  nums1.sort()
  nums2.sort()
  var pointer1 = 0
  var pointer2 = 0
  val intersection = LinkedList<Int>()
  while (pointer1 < nums1.size && pointer2 < nums2.size) {
    when {
      nums1[pointer1] == nums2[pointer2] -> {
        intersection.add(nums1[pointer1])
        val t = nums1[pointer1]
        while (pointer1 < nums1.size && nums1[pointer1] == t) pointer1++
        while (pointer2 < nums2.size && nums2[pointer2] == t) pointer2++
      }
      nums1[pointer1] < nums2[pointer2] -> pointer1++
      nums1[pointer1] > nums2[pointer2] -> pointer2++
    }
  }
        
  return intersection.toIntArray()
}
