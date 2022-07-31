
/*
Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of consecutive repeating characters in chars:

    If the group's length is 1, append the character to s.
    Otherwise, append the character followed by the group's length.

The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done modifying the input array, return the new length of the array.

You must write an algorithm that uses only constant extra space.
*/

fun compress(chars: CharArray): Int {
    var currChar = chars[0]
    var count = 0
    var wrtPointer = 0
    for (char in chars) {
        if (char != currChar) {
            chars[wrtPointer++] = currChar
            if (count > 1) for (countChar in count.toString()) chars[wrtPointer++] = countChar
            currChar = char
            count = 1
        } else count++
    }
    
    chars[wrtPointer++] = currChar
    if (count > 1) for (countChar in count.toString()) chars[wrtPointer++] = countChar
    
    return wrtPointer
}