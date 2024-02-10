
/*
Return all non-negative integers of length n such that the absolute difference between every two consecutive digits is k.

Note that every number in the answer must not have leading zeros. For example, 01 has one leading zero and is invalid.

You may return the answer in any order.
*/

fun numsSameConsecDiff(n: Int, k: Int): IntArray {
    val result = ArrayList<Int>()
    
    fun backtrack(number: Int, numberLength: Int) {
        if (numberLength == n) {
            result.add(number)
            return
        }
        
        val lastDigit = number % 10
        if (lastDigit + k <= 9) backtrack(number * 10 + (lastDigit + k), numberLength + 1)
        if (lastDigit - k >= 0 && lastDigit - k != lastDigit + k) backtrack(number * 10 + (lastDigit - k), numberLength + 1)
    }
    
    for (i in 1..9) backtrack(i, 1)
    
    return result.toIntArray()
}