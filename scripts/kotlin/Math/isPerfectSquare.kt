
/*
Given a positive integer num, write a function which returns True if num is a perfect square else False.
*/

fun isPerfectSquare(num: Int): Boolean {
  if (num == 1) return true
        
  var x = num.shr(1)
  val seen = hashSetOf(x)
        
  while (x * x != num) {
    x = (x + (num / x)).shr(1)
    if (x in seen) return false
    seen.add(x)
  }
  return true
}
