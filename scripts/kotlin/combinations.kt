
/*
Efficient calculation of combinations of k from n
*/

fun combinations(k: Int, n: Int): Int {
  var N = n.toLong()
  var result = 1L
  for (i in 1..k) {
    result = (result * N--) / i.toLong()
  }
  return result
}
