
/*
Given an integer num, return a string of its base 7 representation.
*/

fun convertToBase7(num: Int): String {
  if (num == 0) return "0"
        
  val result = StringBuilder()
  var n = num
  if (num < 0) n = -n
  while (n != 0) {
    result.append(n % 7)
    n /= 7
  }
  if (num < 0) result.append("-")
  return result.toString().reversed()
}
