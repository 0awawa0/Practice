
/*
Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.

We repeatedly make duplicate removals on S until we no longer can.

Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.
*/

fun removeDuplicates(S: String): String {
        
    val result = StringBuilder()
    for (i in s.indices) {
        if (result.isNotEmpty() && result.last() == s[i]) result.deleteCharAt(result.lastIndex)
        else result.append(s[i])
    }
    return result.toString()
}

fun main(args: Array<String>) {
    print("Enter a string >> ")
    val s = readLine()!!
    println("Result >> ${removeDuplicates(s)}")
}
