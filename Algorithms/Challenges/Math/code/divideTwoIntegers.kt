
/*
Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.

The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

Return the quotient after dividing dividend by divisor.

Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.
*/

fun divide(dividend: Int, divisor: Int): Int {
    if (dividend == 0) return 0
        
    val sign = if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) -1 else 1
    val divid = abs(dividend.toLong())
    val divis = abs(divisor.toLong())
    var t = 0L
    var result = 0L
        
    for (i in 31 downTo 0) {
        if (t + (divis.shl(i)) <= divid) {
            t += divis.shl(i)
            result = result.or(1L.shl(i))
        }
    }
        
    result *= sign
    result = maxOf(result, Int.MIN_VALUE.toLong())
    result = minOf(result, Int.MAX_VALUE.toLong())
        
    return result.toInt()
}