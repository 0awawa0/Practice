
/*
Given n orders, each order consist in pickup and delivery services. Count all valid pickup/delivery possible sequences such that delivery(i) is always after of pickup(i). 

Since the answer may be too large, return it modulo 10^9 + 7.
*/

fun countOrders(n: Int): Int {
  val mod = 1_000_000_007L
  var answer = 1L
  for (i in 1..n) {
    answer = (answer * i.toLong()) % mod
    answer = (answer * (2L * i.toLong() - 1L)) % mod
  }
  return answer.toInt()
}
