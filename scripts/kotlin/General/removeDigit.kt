
/*
You are given a string number representing a positive integer and a character digit.

Return the resulting string after removing exactly one occurrence of digit from number such that the value of the resulting string in decimal form is maximized. The test cases are generated such that digit occurs at least once in number.
*/

fun removeDigit(number: String, digit: Char): String {
    var maxInt = BigInteger.ZERO
    for (i in number.indices) {
        if (number[i] != digit) continue
        val newNum = BigInteger(number.substring(0 until i) + number.substring(i + 1 until number.length))
        maxInt = maxOf(maxInt, newNum)
    }
    return maxInt.toString()
}