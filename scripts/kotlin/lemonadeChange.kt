
/*
At a lemonade stand, each lemonade costs $5. Customers are standing in a queue to buy from you and order one at a time (in the order specified by bills). Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill. You must provide the correct change to each customer so that the net transaction is that the customer pays $5.

Note that you do not have any change in hand at first.

Given an integer array bills where bills[i] is the bill the ith customer pays, return true if you can provide every customer with the correct change, or false otherwise.
*/

fun lemonadeChange(bills: IntArray): Boolean {
  var fives = 0
  var tens = 0
  val cost = 5
  for (bill in bills) {
    when (bill) {
      5 -> fives++
      10 -> {
        if (fives <= 0) return false
        fives--
        tens++
      }
      20 -> {
        if (tens > 0) {
          if (fives <= 0) return false
          tens--
          fives--
        } else {
          if (fives < 3) return false
          fives -= 3
        }
      }
    }
  }
        
  return true
}
