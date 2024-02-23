# Last Non Empty String

## Challenge
You are given a string `s`.

Consider performing the following operation until `s` becomes empty:

    For every alphabet character from 'a' to 'z', remove the first occurrence of that character in s (if it exists).

Return the value of the string `s` right before applying the last operation.

__Example 1:__

    Input: s = "aabcbbca"
    Output: "ba"
    Explanation: Explained in the statement.

__Example 2:__

    Input: s = "abcd"
    Output: "abcd"
    Explanation: We do the following operation:
    - Remove the underlined characters s = "abcd". The resulting string is s = "".
    The string just before the last operation is "abcd".

### Constraints:

    1 <= s.length <= 5 * 105
    s consists only of lowercase English letters.

## Solution
TODO

## Code

```Kotlin
fun lastNonEmptyString(s: String): String {
    val marks = IntArray(s.length)
    val counts = HashMap<Char, Int>()
        
    for (i in s.indices) {
        val ch = s[i]
        counts[ch] = (counts[ch] ?: 0) + 1
        marks[i] = counts[ch]!!
    }
        
    val maxValue = marks.max()
        
    return buildString { 
        for (i in s.indices) {
            if (marks[i] == maxValue) append(s[i])
        }
    }
}
```