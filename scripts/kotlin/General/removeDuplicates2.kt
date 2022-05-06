
/*
You are given a string s and an integer k, a k duplicate removal consists of choosing k adjacent and equal letters from s and removing them, causing the left and the right side of the deleted substring to concatenate together.

We repeatedly make k duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made.
*/

fun removeDuplicates(s: String, k: Int): String {
    var insertPosition = 0
    val stack = CharArray(s.length)
    val repeats = IntArray(s.length)
    for (i in s.indices) {
        stack[insertPosition] = s[i]
            
        if (insertPosition > 0 && stack[insertPosition - 1] == stack[insertPosition]) 
            repeats[insertPosition] = repeats[insertPosition - 1] + 1
        else 
            repeats[insertPosition] = 1
            
        if (repeats[insertPosition] == k) insertPosition -= k
        insertPosition++
    }
        
    return String(stack, 0, insertPosition)
}