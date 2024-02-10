
/*
Given an integer num, return a string representing its hexadecimal representation. For negative integers, two’s complement method is used.
All the letters in the answer string should be lowercase characters, and there should not be any leading zeros in the answer except for the zero itself.
*/

fun toHex(num: Int): String {
  val hex = "0123456789abcdef".toCharArray()
  val builder = StringBuilder()
        
  var skippedZeroes = false
  for (i in 7 downTo 0) {
    val n = num.shr(i * 4).and(0x0f)
    if (n != 0) skippedZeroes = true
    if (n == 0 && !skippedZeroes) continue
            
    builder.append(hex[n])
  }
          
  builder.ifEmpty { builder.append('0') }
  return builder.toString()
}
