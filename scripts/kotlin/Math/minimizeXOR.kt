
/*
Given two positive integers num1 and num2, find the integer x such that:

    + x has the same number of set bits as num2, and
    + The value x XOR num1 is minimal.

Note that XOR is the bitwise XOR operation.

Return the integer x. The test cases are generated such that x is uniquely determined.

The number of set bits of an integer is the number of 1's in its binary representation.
*/

fun minimizeXor(num1: Int, num2: Int): Int {
    val num1Bits = countBits(num1)
    val num2Bits = countBits(num2)
    
    when {
        num1Bits == num2Bits -> return num1
        num1Bits < num2Bits -> {
            var res = num1
            var shift = 0
            var bitsLeft = num2Bits - num1Bits
            while (bitsLeft > 0) {
                if (num1.shr(shift) % 2 == 0) {
                    res = res.or(1.shl(shift))
                    bitsLeft--
                }
                shift++
            }
            return res
        }
        else -> {
            var res = num1
            var shift = 0
            var bitsLeft = num1Bits
            while (bitsLeft > num2Bits) {
                if (res % 2 == 1) bitsLeft--
                res = res.shr(1)
                shift++
            }
            return res.shl(shift)
        }
    }
}

private fun countBits(num: Int): Int {
    var n = num
    var count = 0
    while (n > 0) {
        if (n % 2 == 1) count++
        n = n.shr(1)
    }
    return count
}