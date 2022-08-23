

/*
You are given a string num consisting of digits only.

Return the largest palindromic integer (in the form of a string) that can be formed using digits taken from num. It should not contain leading zeroes.

Notes:

    You do not need to use all the digits of num, but you must use at least one digit.
    The digits can be reordered.
*/


fun largestPalindromic(num: String): String {
    val frequencies = IntArray(10)
    num.forEach { frequencies[it - '0']++ }
    
    var result = LinkedList<Char>()
    var usedOddValue = false
    var odd = 0
    for (i in 1 .. 9) {
        repeat(frequencies[i] / 2) { result.addFirst('0' + i) }
        repeat(frequencies[i] / 2) { result.addLast('0' + i) }
        if (frequencies[i] % 2 != 0) {
            usedOddValue = true
            odd = i
        }
    }
    
    if (result.size > 1) {
        if (frequencies[0] % 2 != 0) {
            repeat(frequencies[0] - 1) { result.add(result.size / 2, '0') }
            if (!usedOddValue) result.add(result.size / 2, '0')
        } else { repeat(frequencies[0]) { result.add(result.size / 2, '0') }}
    }
    if (usedOddValue) result.add(result.size / 2, '0' + odd)
    
    if (result.size == 0) return "0"
    return result.joinToString("") { it.toString() }
}