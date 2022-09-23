
/*
Given an integer n, return the decimal value of the binary string formed by concatenating the binary representations of 1 to n in order, modulo 10^9 + 7.
*/

fun concatenatedBinary(n: Int): Int {
    var result = 0L
    var currLength = 0
    val modulo = 1_000_000_007L
    for (num in 1L .. n.toLong()) 
        result = (result.shl(getBinaryLength(num)).or(num)) % modulo
    return result.toInt()
}

fun getBinaryLength(n: Long): Int {
    if (n < 1) return 1
    var num = 1
    var length = 1
    while (num <= n) {
        num = num.shl(1)
        length++
    }
    return length - 1
}