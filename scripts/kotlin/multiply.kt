
/*
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
*/

fun multiply(num1: String, num2: String): String {
  if (num1 == "0" || num2 == "0") return "0"
        
  val toAdd = LinkedList<String>()
  var pointer2 = num2.lastIndex
        
  while (pointer2 >= 0) {
    val shift = num2.lastIndex - pointer2
    val number = StringBuilder()
    val n = Character.getNumericValue(num2[pointer2--])
    repeat(shift) { number.append(0) }
            
    var pointer1 = num1.lastIndex
    var carry = 0
    while (pointer1 >= 0) {
      val s = Character.getNumericValue(num1[pointer1--]) * n + carry
      carry = s / 10
      number.append(s % 10)
    }
    if (carry != 0) number.append(carry)
    toAdd.push(number.toString().reversed())
  }
        
  while(toAdd.size > 1) {
    val n1 = toAdd.pop()
    val n2 = toAdd.pop()
    toAdd.push(add(n1, n2))
  }
        
  return toAdd.pop()
}
    
fun add(num1: String, num2: String): String {
  var carry = 0
  val result = StringBuilder()
  var pointer1 = num1.lastIndex
  var pointer2 = num2.lastIndex
  while (pointer1 >= 0 && pointer2 >= 0) {
    val s = Character.getNumericValue(num1[pointer1--]) + Character.getNumericValue(num2[pointer2--]) + carry
    carry = s / 10
    result.append(s % 10)
  }
        
  while (pointer1 >= 0) {
    val s = Character.getNumericValue(num1[pointer1--]) + carry
    carry = s / 10
    result.append(s % 10)
  }
        
  while (pointer2 >= 0) {
    val s = Character.getNumericValue(num2[pointer2--]) + carry
    carry = s / 10
    result.append(s % 10)
  }
        
  if (carry == 1) result.append(1)
  return result.toString().reversed()
}
