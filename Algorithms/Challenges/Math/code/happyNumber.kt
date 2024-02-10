
/*
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

    Starting with any positive integer, replace the number by the sum of the squares of its digits.
    Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
    Those numbers for which this process ends in 1 are happy.

Return true if n is a happy number, and false if not.
*/

fun isHappy(n: Int): Boolean {
  val seen = HashSet<Int>()
  var oldN = n
  var newN = 0
        
  while (oldN !in seen) {
    seen.add(oldN)
    while (oldN != 0) {
      newN += (oldN % 10) * (oldN % 10)
      oldN = oldN / 10
    }
            
    if (newN == 1) return true
    oldN = newN
    newN = 0
  }
        
  return false
}
