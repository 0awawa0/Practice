
/*
You are given a positive integer num. You may swap any two digits of num that have the same parity (i.e. both odd digits or both even digits).

Return the largest possible value of num after any number of swaps.
*/

fun largestInteger(num: Int): Int {
    val digits = ArrayList<Int>()
    var n = num
    while (n > 0) {
        digits.add(n % 10)
        n /= 10
    }
        
    digits.reverse()
        
    for (i in digits.indices) {
        for (j in i + 1 until digits.size) {
            if (digits[i] % 2 == digits[j] % 2 && digits[j] > digits[i]) {
                val t = digits[j]
                digits[j] = digits[i]
                digits[i] = t
            }
        }
    }
        
    var res = digits[0]
    for (i in 1 until digits.size) res = res * 10 + digits[i]
    return res
}