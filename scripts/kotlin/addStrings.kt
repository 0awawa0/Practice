
/*
Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
*/

fun addStrings(num1: String, num2: String): String {
  val result = StringBuilder()
  var firstPointer = num1.lastIndex
  var secondPointer = num2.lastIndex
  var carry = 0
  while (firstPointer >= 0 && secondPointer >= 0) {
    val d1 = num1[firstPointer--].numericValue()
    val d2 = num2[secondPointer--].numericValue()
    val s = d1 + d2 + carry
    if (s > 9) carry = 1
    else carry = 0
    result.insert(0, s % 10)
  }
        
  while (firstPointer >= 0) {
    val s = num1[firstPointer--].numericValue() + carry
    if (s > 9) carry = 1
    else carry = 0
    result.insert(0, s % 10)
  }
        
  while (secondPointer >= 0) {
    val s = num2[secondPointer--].numericValue() + carry
    if (s > 9) carry = 1
    else carry = 0
    result.insert(0, s % 10)
  }
        
  if (carry == 1) result.insert(0, carry)
  return result.toString()
}
    
fun Char.numericValue(): Int { return Character.getNumericValue(this) }
