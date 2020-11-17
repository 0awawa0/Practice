/*
Task: Given string `s`. Find length of the longest substring without repeating characters.
*/


fun lengthOfLongestSubstring(s: String): Int {
        val charMap = HashMap<Char, Int>()
        var maxLength = 0
        
        var i = 0
        var j = 0
        for (c in s) {
            if (c in charMap) {
                i = maxOf(charMap[c]!!, i)
            }
            
            j += 1
            charMap[c] = j
            maxLength = maxOf(maxLength, j - i)
        }
        
        return maxLength
    }


fun main(args: Array<String>) {
    println("Length of longest substring is ${lengthOfLongestSubstring(args[0])}")
}
