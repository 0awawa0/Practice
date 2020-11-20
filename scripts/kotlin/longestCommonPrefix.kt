/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
*/

fun longestCommonPrefix(strs: Array<String>): String {
    
    if (strs.size == 0) return ""
    for (str in strs) { if (str.length == 0) return "" }
        
    val result = StringBuilder()
        
    var i = 0
    while (true) {
        for (str in strs) { if (i >= str.length) return result.toString() }
            
        val chr = strs[0][i]
        for (str in strs) {
            if (str[i] != chr) { return result.toString() }
        }
        result.append(chr)
        i += 1
    }
    
    return result.toString()
}


fun main(args: Array<String>) {
    println("Longest common prefix is ${longestCommonPrefix(args)}")
}
