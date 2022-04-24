
/*
The array-form of an integer num is an array representing its digits in left to right order. 
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
*/

fun addToArrayForm(num: IntArray, k: Int): List<Int> {
  val kArrayForm = k.toArrayForm()
  val result = LinkedList<Int>()
        
  var p1 = num.lastIndex
  var p2 = kArrayForm.lastIndex
  var carry = 0
  while (p1 >= 0 && p2 >= 0) {
    val s = num[p1--] + kArrayForm[p2--] + carry
    carry = if (s > 9) 1 else 0
    result.addFirst(s % 10)
  }
        
  while (p1 >= 0) {
    val s = num[p1--] + carry
    carry = if (s > 9) 1 else 0
    result.addFirst(s % 10)
  }
        
  while (p2 >= 0) {
    val s = kArrayForm[p2--] + carry
    carry = if (s > 9) 1 else 0
    result.addFirst(s % 10)
  }
        
  if (carry == 1) result.addFirst(carry)
  return result
}
    
private fun Int.toArrayForm(): IntArray {
  var n = this
  val result = LinkedList<Int>()
  while (n != 0) {
    result.addFirst(n % 10)
    n /= 10
  }
  return result.toIntArray()
}
