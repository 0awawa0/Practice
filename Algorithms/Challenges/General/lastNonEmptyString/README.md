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

    1 <= s.length <= 5 * 10^5
    s consists only of lowercase English letters.

## Solution

Straightforward observation here is that at a time of applying the last operation before string becomes empty, the string consists only of the last occurrences of characters with the highest frequency.
Consider example 1. The string is `aabcbbca`. Letters freqyencies are:

|||
|-|-|
|a|3|
|b|3|
|c|2|

Letters `a` and `b` both have the highest frequency of occurrence, which is `3`. So right before string becomes empty it contains only last occurrences of these letters, i.e. `ba`.

So we need to:
1) Count frequencies of all characters
2) Keep track of the last occurrence of each letter in the string. To do that, we user array `marks`, where `marks[i]` is a number of occurrences of character `s[i]` up to index `i`.
3) Find max frequency `maxFrequency`.
4) Build new string adding to it only those characters `s[i]`, where `marks[i] == maxFrequency` (i.e. this is the character with the highest frequency, and also it is a last occurrence of this character in the string).

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
        
    val maxFrequency = marks.max()
        
    return buildString { 
        for (i in s.indices) {
            if (marks[i] == maxFrequency) append(s[i])
        }
    }
}
```