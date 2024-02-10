
/*
The k-beauty of an integer num is defined as the number of substrings of num when it is read as a string that meet the following conditions:

    It has a length of k.
    It is a divisor of num.

Given integers num and k, return the k-beauty of num.

Note:

    Leading zeros are allowed.
    0 is not a divisor of any value.

A substring is a contiguous sequence of characters in a string.
*/

fun divisorSubstrings(num: Int, k: Int): Int {
    val strNum = num.toString()
    var count = 0
    for (right in k .. strNum.length) {
        val left = right - k
        val subNum = strNum.substring(left until right).toInt()
        if (subNum != 0 && num % subNum == 0) count++
    }
    return count
}