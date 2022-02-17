
/*
Reverse bits of a given 32 bits unsigned integer.
*/

fun reverseBits(n:Int):Int {
  var n = n
  var result = 0
  var count = 32
  while (count > 0) {
    result = result.shl(1) + (n.and(1))
    n = n.shr(1)
    count--
  }
  return result
}
