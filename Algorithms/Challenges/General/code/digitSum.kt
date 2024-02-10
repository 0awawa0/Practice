
/*
You are given a string s consisting of digits and an integer k.

A round can be completed if the length of s is greater than k. In one round, do the following:

    Divide s into consecutive groups of size k such that the first k characters are in the first group, the next k characters are in the second group, and so on. Note that the size of the last group can be smaller than k.
    Replace each group of s with a string representing the sum of all its digits. For example, "346" is replaced with "13" because 3 + 4 + 6 = 13.
    Merge consecutive groups together to form a new string. If the length of the string is greater than k, repeat from step 1.

Return s after all rounds have been completed.
*/


fun digitSum(s: String, k: Int): String {
    if (s.length <= k) return s
        
    val queue = LinkedList<Int>()
    for (char in s) queue.add(Character.getNumericValue(char))
        
    while (queue.size > k) {
        val groups = if (queue.size % k == 0) queue.size / k else queue.size / k + 1
        val temp = LinkedList<Int>()
        repeat(groups) {
            var sum = 0
            var i = 0
            while(queue.isNotEmpty() && i < k) {
                sum += queue.poll()!!
                i++
            }
            temp.addAll(splitDigits(sum))
        }
        queue.addAll(temp)
    }
    return queue.joinToString(separator="") { it.toString() }
}
    
private fun splitDigits(number: Int): List<Int> {
    if (number == 0) return listOf(0)
    var n = number
    val result = LinkedList<Int>()
    while (n > 0) {
        result.add(n % 10)
        n /= 10
    }
    result.reverse()
    return result
}